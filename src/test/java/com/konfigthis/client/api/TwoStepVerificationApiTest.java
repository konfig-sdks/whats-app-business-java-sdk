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
import com.konfigthis.client.model.EnableTwoStepRequestBody;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TwoStepVerificationApi
 */
@Disabled
public class TwoStepVerificationApiTest {

    private static TwoStepVerificationApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new TwoStepVerificationApi(apiClient);
    }

    /**
     * Disable-Two-Step
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void disableTest() throws ApiException {
        api.disable()
                .execute();
        // TODO: test validations
    }

    /**
     * Enable-Two-Step
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void enableAccountTest() throws ApiException {
        String pin = null;
        api.enableAccount(pin)
                .execute();
        // TODO: test validations
    }

}
