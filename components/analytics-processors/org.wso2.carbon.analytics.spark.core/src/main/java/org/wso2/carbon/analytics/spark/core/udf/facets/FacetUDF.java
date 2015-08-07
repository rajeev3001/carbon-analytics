/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.analytics.spark.core.udf.facets;

import java.util.ArrayList;
import java.util.List;

/**
 * represents the Facet UDF
 * provides Facet functionality to sparkSQL queries
 * ex: select x,y,facet2(x,y) from test
 *
 * todo: remove unnecessary naming convention for different number of arguments
 * once SparkSQL supports generic UDFs
 */
public class FacetUDF {

    /**
     * Returns an String Array list when given the arguments
     * @param facet_1
     * @return List<String>
     */
    public List<String> facet1(Object facet_1) {
        return FacetUtils.getFacetArray(facet_1);
    }

    public List<String> facet2(Object facet_1, Object facet_2) {
        return FacetUtils.getFacetArray(facet_1,facet_2);
    }

    public List<String> facet3(Object facet_1, Object facet_2, Object facet_3) {
        return FacetUtils.getFacetArray(facet_1,facet_2,facet_3);
    }

    public List<String> facet4(Object facet_1, Object facet_2, Object facet_3, Object facet_4) {
        return FacetUtils.getFacetArray(facet_1,facet_2,facet_3,facet_4);
    }

    public List<String> facet5(Object facet_1, Object facet_2, Object facet_3, Object facet_4, Object facet_5) {
        return FacetUtils.getFacetArray(facet_1,facet_2,facet_3,facet_4,facet_5);
    }

    public List<String> facet6(Object facet_1, Object facet_2, Object facet_3, Object facet_4, Object facet_5,
                               Object facet_6) {
        return FacetUtils.getFacetArray(facet_1,facet_2,facet_3,facet_4,facet_5,facet_6);
    }

    public List<String> facet7(Object facet_1, Object facet_2, Object facet_3, Object facet_4, Object facet_5,
                               Object facet_6, Object facet_7) {
        return FacetUtils.getFacetArray(facet_1,facet_2,facet_3,facet_4,facet_5,facet_6,facet_7);
    }

    public List<String> facet8(Object facet_1, Object facet_2, Object facet_3, Object facet_4, Object facet_5,
                               Object facet_6, Object facet_7, Object facet_8) {
        return FacetUtils.getFacetArray(facet_1,facet_2,facet_3,facet_4,facet_5,facet_6,facet_7,facet_8);
    }

    public List<String> facet9(Object facet_1, Object facet_2, Object facet_3, Object facet_4, Object facet_5,
                               Object facet_6, Object facet_7, Object facet_8, Object facet_9) {
        return FacetUtils.getFacetArray(facet_1,facet_2,facet_3,facet_4,facet_5,facet_6,facet_7,facet_8,facet_9);
    }

    public List<String> facet10(Object facet_1, Object facet_2, Object facet_3, Object facet_4, Object facet_5,
                                Object facet_6, Object facet_7, Object facet_8, Object facet_9, Object facet_10) {
        return FacetUtils.getFacetArray(facet_1,facet_2,facet_3,facet_4,facet_5,facet_6,facet_7,facet_8,facet_9,
                facet_10);
    }

    public List<String> facet11(Object facet_1, Object facet_2, Object facet_3, Object facet_4, Object facet_5,
                                Object facet_6, Object facet_7, Object facet_8, Object facet_9, Object facet_10,
                                Object facet_11) {
        return FacetUtils.getFacetArray(facet_1,facet_2,facet_3,facet_4,facet_5,facet_6,facet_7,facet_8,facet_9,
                facet_10,facet_11);
    }

    public List<String> facet12(Object facet_1, Object facet_2, Object facet_3, Object facet_4, Object facet_5,
                                Object facet_6, Object facet_7, Object facet_8, Object facet_9, Object facet_10,
                                Object facet_11, Object facet_12) {
        return FacetUtils.getFacetArray(facet_1,facet_2,facet_3,facet_4,facet_5,facet_6,facet_7,facet_8,facet_9,
                facet_10,facet_11,facet_12);
    }

    public List<String> facet13(Object facet_1, Object facet_2, Object facet_3, Object facet_4, Object facet_5,
                                Object facet_6, Object facet_7, Object facet_8, Object facet_9, Object facet_10,
                                Object facet_11, Object facet_12, Object facet_13) {
        return FacetUtils.getFacetArray(facet_1,facet_2,facet_3,facet_4,facet_5,facet_6,facet_7,facet_8,facet_9,
                facet_10,facet_11,facet_12,facet_13);
    }

    public List<String> facet14(Object facet_1, Object facet_2, Object facet_3, Object facet_4, Object facet_5,
                                Object facet_6, Object facet_7, Object facet_8, Object facet_9, Object facet_10,
                                Object facet_11, Object facet_12, Object facet_13, Object facet_14) {
        return FacetUtils.getFacetArray(facet_1,facet_2,facet_3,facet_4,facet_5,facet_6,facet_7,facet_8,facet_9,
                facet_10,facet_11,facet_12,facet_13,facet_14);
    }

    public List<String> facet15(Object facet_1, Object facet_2, Object facet_3, Object facet_4, Object facet_5,
                                Object facet_6, Object facet_7, Object facet_8, Object facet_9, Object facet_10,
                                Object facet_11, Object facet_12, Object facet_13, Object facet_14, Object facet_15) {
        return FacetUtils.getFacetArray(facet_1,facet_2,facet_3,facet_4,facet_5,facet_6,facet_7,facet_8,facet_9,
                facet_10,facet_11,facet_12,facet_13,facet_14,facet_15);
    }

    public List<String> facet16(Object facet_1, Object facet_2, Object facet_3, Object facet_4, Object facet_5,
                                Object facet_6, Object facet_7, Object facet_8, Object facet_9, Object facet_10,
                                Object facet_11, Object facet_12, Object facet_13, Object facet_14, Object facet_15,
                                Object facet_16) {
        return FacetUtils.getFacetArray(facet_1,facet_2,facet_3,facet_4,facet_5,facet_6,facet_7,facet_8,facet_9,
                facet_10,facet_11,facet_12,facet_13,facet_14,facet_15,facet_16);
    }

    public List<String> facet17(Object facet_1, Object facet_2, Object facet_3, Object facet_4, Object facet_5,
                                Object facet_6, Object facet_7, Object facet_8, Object facet_9, Object facet_10,
                                Object facet_11, Object facet_12, Object facet_13, Object facet_14, Object facet_15,
                                Object facet_16, Object facet_17) {
        return FacetUtils.getFacetArray(facet_1,facet_2,facet_3,facet_4,facet_5,facet_6,facet_7,facet_8,facet_9,
                facet_10,facet_11,facet_12,facet_13,facet_14,facet_15,facet_16,facet_17);
    }

    public List<String> facet18(Object facet_1, Object facet_2, Object facet_3, Object facet_4, Object facet_5,
                                Object facet_6, Object facet_7, Object facet_8, Object facet_9, Object facet_10,
                                Object facet_11, Object facet_12, Object facet_13, Object facet_14, Object facet_15,
                                Object facet_16, Object facet_17, Object facet_18) {
        return FacetUtils.getFacetArray(facet_1,facet_2,facet_3,facet_4,facet_5,facet_6,facet_7,facet_8,facet_9,
                facet_10,facet_11,facet_12,facet_13,facet_14,facet_15,facet_16,facet_17,facet_18);
    }

    public List<String> facet19(Object facet_1, Object facet_2, Object facet_3, Object facet_4, Object facet_5,
                                Object facet_6, Object facet_7, Object facet_8, Object facet_9, Object facet_10,
                                Object facet_11, Object facet_12, Object facet_13, Object facet_14, Object facet_15,
                                Object facet_16, Object facet_17, Object facet_18, Object facet_19) {
        return FacetUtils.getFacetArray(facet_1,facet_2,facet_3,facet_4,facet_5,facet_6,facet_7,facet_8,facet_9,
                facet_10,facet_11,facet_12,facet_13,facet_14,facet_15,facet_16,facet_17,facet_18,facet_19);
    }

    public List<String> facet20(Object facet_1, Object facet_2, Object facet_3, Object facet_4, Object facet_5,
                                Object facet_6, Object facet_7, Object facet_8, Object facet_9, Object facet_10,
                                Object facet_11, Object facet_12, Object facet_13, Object facet_14, Object facet_15,
                                Object facet_16, Object facet_17, Object facet_18, Object facet_19, Object facet_20) {
        return FacetUtils.getFacetArray(facet_1, facet_2, facet_3, facet_4, facet_5, facet_6, facet_7, facet_8, facet_9,
                facet_10, facet_11, facet_12, facet_13, facet_14, facet_15, facet_16, facet_17, facet_18, facet_19, facet_20);
    }
    public List<String> facet21(Object facet_1, Object facet_2, Object facet_3, Object facet_4, Object facet_5,
                                Object facet_6, Object facet_7, Object facet_8, Object facet_9, Object facet_10,
                                Object facet_11, Object facet_12, Object facet_13, Object facet_14, Object facet_15,
                                Object facet_16, Object facet_17, Object facet_18, Object facet_19, Object facet_20,
                                Object facet_21) {
        return FacetUtils.getFacetArray(facet_1,facet_2,facet_3,facet_4,facet_5,facet_6,facet_7,facet_8,facet_9,
                facet_10,facet_11,facet_12,facet_13,facet_14,facet_15,facet_16,facet_17,facet_18,facet_19,facet_20,
                facet_21);
    }

    public List<String> facet22(Object facet_1, Object facet_2, Object facet_3, Object facet_4, Object facet_5,
                                Object facet_6, Object facet_7, Object facet_8, Object facet_9, Object facet_10,
                                Object facet_11, Object facet_12, Object facet_13, Object facet_14, Object facet_15,
                                Object facet_16, Object facet_17, Object facet_18, Object facet_19, Object facet_20,
                                Object facet_21, Object facet_22) {
        return FacetUtils.getFacetArray(facet_1,facet_2,facet_3,facet_4,facet_5,facet_6,facet_7,facet_8,facet_9,
                facet_10,facet_11,facet_12,facet_13,facet_14,facet_15,facet_16,facet_17,facet_18,facet_19,facet_20,
                facet_21,facet_22);
    }
}
