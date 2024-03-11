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
import com.konfigthis.client.model.BusinessProfile;
import com.konfigthis.client.model.GetBusinessProfileResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BusinessProfileApi
 */
@Disabled
public class BusinessProfileApiTest {

    private static BusinessProfileApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new BusinessProfileApi(apiClient);
    }

    /**
     * Get-Business-Profile
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTest() throws ApiException {
        GetBusinessProfileResponse response = api.get()
                .execute();
        // TODO: test validations
    }

    /**
     * Update-Business-Profile
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateTest() throws ApiException {
        String description = null;
        String address = null;
        String email = null;
        String vertical = null;
        List<String> websites = null;
        api.update(description, address, email, vertical, websites)
                .execute();
        // TODO: test validations
    }

}