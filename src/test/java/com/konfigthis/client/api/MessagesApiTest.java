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
import com.konfigthis.client.model.Contact;
import com.konfigthis.client.model.Hsm;
import com.konfigthis.client.model.Location;
import com.konfigthis.client.model.MarkMessageAsReadRequestBody;
import com.konfigthis.client.model.MessageResponse;
import com.konfigthis.client.model.MessageType;
import com.konfigthis.client.model.SendMessageRequestBody;
import com.konfigthis.client.model.Text;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MessagesApi
 */
@Disabled
public class MessagesApiTest {

    private static MessagesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new MessagesApi(apiClient);
    }

    /**
     * Mark-Message-As-Read
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void markAsReadTest() throws ApiException {
        String status = null;
        String messageID = null;
        api.markAsRead(status, messageID)
                .execute();
        // TODO: test validations
    }

    /**
     * Send-Message
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sendMessageTest() throws ApiException {
        String to = null;
        Object audio = null;
        List<Contact> contacts = null;
        Object document = null;
        Hsm hsm = null;
        Object image = null;
        Location location = null;
        Boolean previewUrl = null;
        String recipientType = null;
        Text text = null;
        Object ttl = null;
        MessageType type = null;
        Object video = null;
        MessageResponse response = api.sendMessage(to)
                .audio(audio)
                .contacts(contacts)
                .document(document)
                .hsm(hsm)
                .image(image)
                .location(location)
                .previewUrl(previewUrl)
                .recipientType(recipientType)
                .text(text)
                .ttl(ttl)
                .type(type)
                .video(video)
                .execute();
        // TODO: test validations
    }

}
