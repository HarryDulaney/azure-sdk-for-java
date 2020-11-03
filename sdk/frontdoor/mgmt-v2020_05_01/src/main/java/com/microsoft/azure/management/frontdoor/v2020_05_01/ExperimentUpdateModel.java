/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.frontdoor.v2020_05_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Defines modifiable attributes of an Experiment.
 */
@JsonFlatten
public class ExperimentUpdateModel {
    /**
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * The description of the intent or details of the Experiment.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * The state of the Experiment. Possible values include: 'Enabled',
     * 'Disabled'.
     */
    @JsonProperty(value = "properties.enabledState")
    private State enabledState;

    /**
     * Get resource tags.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set resource tags.
     *
     * @param tags the tags value to set
     * @return the ExperimentUpdateModel object itself.
     */
    public ExperimentUpdateModel withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the description of the intent or details of the Experiment.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description of the intent or details of the Experiment.
     *
     * @param description the description value to set
     * @return the ExperimentUpdateModel object itself.
     */
    public ExperimentUpdateModel withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the state of the Experiment. Possible values include: 'Enabled', 'Disabled'.
     *
     * @return the enabledState value
     */
    public State enabledState() {
        return this.enabledState;
    }

    /**
     * Set the state of the Experiment. Possible values include: 'Enabled', 'Disabled'.
     *
     * @param enabledState the enabledState value to set
     * @return the ExperimentUpdateModel object itself.
     */
    public ExperimentUpdateModel withEnabledState(State enabledState) {
        this.enabledState = enabledState;
        return this;
    }

}