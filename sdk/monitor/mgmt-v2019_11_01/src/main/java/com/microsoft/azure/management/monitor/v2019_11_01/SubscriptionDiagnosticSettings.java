/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2019_11_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.collection.SupportsListing;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.monitor.v2019_11_01.implementation.SubscriptionDiagnosticSettingsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing SubscriptionDiagnosticSettings.
 */
public interface SubscriptionDiagnosticSettings extends SupportsCreating<SubscriptionDiagnosticSettingsResource.DefinitionStages.Blank>, SupportsListing<SubscriptionDiagnosticSettingsResource>, HasInner<SubscriptionDiagnosticSettingsInner> {
    /**
     * Gets the active subscription diagnostic settings for the specified resource.
     *
     * @param name The name of the diagnostic setting.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SubscriptionDiagnosticSettingsResource> getAsync(String name);

    /**
     * Deletes existing subscription diagnostic settings for the specified resource.
     *
     * @param name The name of the diagnostic setting.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String name);

}