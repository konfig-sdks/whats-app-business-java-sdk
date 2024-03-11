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
import com.konfigthis.client.model.BackupSettingsRequestBody;
import com.konfigthis.client.model.BackupSettingsResponse;
import com.konfigthis.client.model.RestoreSettingsRequestBody;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BackupRestoreApi
 */
@Disabled
public class BackupRestoreApiTest {

    private static BackupRestoreApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new BackupRestoreApi(apiClient);
    }

    /**
     * Backup-Settings
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void settingsPostTest() throws ApiException {
        String password = null;
        BackupSettingsResponse response = api.settingsPost(password)
                .execute();
        // TODO: test validations
    }

    /**
     * Restore-Settings
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void settingsPost_0Test() throws ApiException {
        String data = null;
        String password = null;
        api.settingsPost_0(data, password)
                .execute();
        // TODO: test validations
    }

}