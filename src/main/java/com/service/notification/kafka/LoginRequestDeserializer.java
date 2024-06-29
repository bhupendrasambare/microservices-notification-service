package com.service.notification.kafka;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.service.notification.dto.request.LoginRequest;
import org.apache.kafka.common.serialization.Deserializer;
import java.util.Map;

public class LoginRequestDeserializer implements Deserializer<LoginRequest> {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {
        // No configuration needed
    }

    @Override
    public LoginRequest deserialize(String topic, byte[] data) {
        try {
            return objectMapper.readValue(data, LoginRequest.class);
        } catch (Exception e) {
            return null; // Return null if deserialization fails
        }
    }

    @Override
    public void close() {
        // No cleanup needed
    }
}
