package com.konfigthis.client;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class SimpleTest {
    final String MOCK_SERVER_URL = "http://localhost:4010";

    @Test
    public void initClientTest() {
        Configuration configuration = new Configuration();
        configuration.host = "http://whatsapp.local";
        
        // Configure HTTP bearer authorization: bearerAuth
        configuration.token = "BEARER TOKEN";
        
        // Configure HTTP basic authorization: httpBasic
        configuration.username = "YOUR USERNAME";
        configuration.password = "YOUR PASSWORD";
        WhatsAppBusiness client = new WhatsAppBusiness(configuration);
        assertNotNull(client);
    }
}
