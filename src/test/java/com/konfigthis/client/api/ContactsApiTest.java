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
import com.konfigthis.client.model.CheckContactRequestBody;
import com.konfigthis.client.model.CheckContactResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ContactsApi
 */
@Disabled
public class ContactsApiTest {

    private static ContactsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ContactsApi(apiClient);
    }

    /**
     * Check-Contact
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createContactTest() throws ApiException {
        List<String> contacts = null;
        String blocking = null;
        CheckContactResponse response = api.createContact(contacts)
                .blocking(blocking)
                .execute();
        // TODO: test validations
    }

}
