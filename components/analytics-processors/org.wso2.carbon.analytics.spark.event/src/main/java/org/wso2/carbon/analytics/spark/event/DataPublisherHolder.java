/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *   * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */

package org.wso2.carbon.analytics.spark.event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.databridge.agent.AgentHolder;
import org.wso2.carbon.databridge.agent.DataPublisher;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class DataPublisherHolder implements Serializable {
    private static final long serialVersionUID = 1704808211183828268L;
    private static final Log log = LogFactory.getLog(DataPublisherHolder.class);
    private static volatile DataPublisherHolder instance;
    private Map<String, DataPublisher> dataPublisherMap;

    private DataPublisherHolder() {
        AgentHolder.setConfigPath(System.getProperty("Agent.Config.Path"));
        dataPublisherMap = new HashMap<String, DataPublisher>();
    }

    public static DataPublisherHolder getInstance() {
        if (instance == null ) {
            synchronized (DataPublisherHolder.class) {
                if (instance == null) {
                    instance = new DataPublisherHolder();
                }
            }
        }
        return instance;
    }

    public DataPublisher getDataPublisher(String receiverURLSet, String authURLSet, String username, String password) {
        String dataPublisherKey = receiverURLSet + "_" +  authURLSet + "_" + username  + "_" + password;
        if(!dataPublisherMap.containsKey(dataPublisherKey)) {
            try {
                DataPublisher dataPublisher = new DataPublisher(EventingConstants.THRIFT_AGENT_TYPE, receiverURLSet,
                        authURLSet, username, password);
                dataPublisherMap.put(dataPublisherKey, dataPublisher);
                if (log.isDebugEnabled()) {
                    log.debug("New publisher is add publish events to to : " + receiverURLSet +
                            " , Current publisher count : " + dataPublisherMap.size());
                }
                return dataPublisher;
            } catch (Exception e) {
                log.warn("Failed to create data publisher for publishing events to : " + receiverURLSet, e);
            }
        }
        return dataPublisherMap.get(dataPublisherKey);
    }
}