/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.frontdoor.v2020_05_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for AggregationInterval.
 */
public final class AggregationInterval extends ExpandableStringEnum<AggregationInterval> {
    /** Static value Hourly for AggregationInterval. */
    public static final AggregationInterval HOURLY = fromString("Hourly");

    /** Static value Daily for AggregationInterval. */
    public static final AggregationInterval DAILY = fromString("Daily");

    /**
     * Creates or finds a AggregationInterval from its string representation.
     * @param name a name to look for
     * @return the corresponding AggregationInterval
     */
    @JsonCreator
    public static AggregationInterval fromString(String name) {
        return fromString(name, AggregationInterval.class);
    }

    /**
     * @return known AggregationInterval values
     */
    public static Collection<AggregationInterval> values() {
        return values(AggregationInterval.class);
    }
}