/*
 * WhatsApp Business API
 * See https://developers.facebook.com/docs/whatsapp
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.ApplicationSettings;
import com.konfigthis.client.model.GetMediaProvidersResponse;
import com.konfigthis.client.model.Media;
import com.konfigthis.client.model.MediaProvider;
import com.konfigthis.client.model.Response;
import com.konfigthis.client.model.SetShardsRequestBody;
import com.konfigthis.client.model.Webhooks;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ApplicationApi
 */
@Disabled
public class ApplicationApiTest {

    private static ApplicationApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ApplicationApi(apiClient);
    }

    /**
     * Get-Application-Settings
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSettingsTest() throws ApiException {
        ApplicationSettings response = api.getSettings()
                .execute();
        // TODO: test validations
    }

    /**
     * Get-Media-Providers
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listMediaProvidersTest() throws ApiException {
        GetMediaProvidersResponse response = api.listMediaProviders()
                .execute();
        // TODO: test validations
    }

    /**
     * Delete-Media-Providers
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeProviderTest() throws ApiException {
        String providerName = null;
        api.removeProvider(providerName)
                .execute();
        // TODO: test validations
    }

    /**
     * Reset-Application-Settings
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void resetSettingsTest() throws ApiException {
        api.resetSettings()
                .execute();
        // TODO: test validations
    }

    /**
     * Set-Shards
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setShardsTest() throws ApiException {
        String cc = null;
        String phoneNumber = null;
        String pin = null;
        Integer shards = null;
        api.setShards(cc, phoneNumber, pin, shards)
                .execute();
        // TODO: test validations
    }

    /**
     * Update-Media-Providers
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateMediaProvidersTest() throws ApiException {
        api.updateMediaProviders()
                .execute();
        // TODO: test validations
    }

    /**
     * Update-Application-Settings
     *
     * If a field is not present in the request, no change is made to that setting. For example, if on_call_pager is not sent with the request, the existing configuration for on_call_pager is unchanged.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateSettingsTest() throws ApiException {
        String callbackBackoffDelayMs = null;
        Boolean callbackPersist = null;
        Integer heartbeatInterval = null;
        String maxCallbackBackoffDelayMs = null;
        Media media = null;
        String onCallPager = null;
        Boolean passThrough = null;
        Boolean sentStatus = null;
        Integer unhealthyInterval = null;
        Webhooks webhooks = null;
        Response response = api.updateSettings()
                .callbackBackoffDelayMs(callbackBackoffDelayMs)
                .callbackPersist(callbackPersist)
                .heartbeatInterval(heartbeatInterval)
                .maxCallbackBackoffDelayMs(maxCallbackBackoffDelayMs)
                .media(media)
                .onCallPager(onCallPager)
                .passThrough(passThrough)
                .sentStatus(sentStatus)
                .unhealthyInterval(unhealthyInterval)
                .webhooks(webhooks)
                .execute();
        // TODO: test validations
    }

}
