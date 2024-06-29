package com.service.notification.kafka;

import com.service.notification.dto.request.LoginRequest;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.serializer.ErrorHandlingDeserializer;
import org.springframework.kafka.support.serializer.JsonDeserializer;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "ms-notification", groupId = "ms-notification")
    public void consume(@Payload String message) {
        System.out.println("Consumed message: " + message);
    }

    @KafkaListener(topics = "ms-notification", groupId = "ms-notification",
            containerFactory = "loginRequestKafkaListenerContainerFactory")
    public void consume(@Payload LoginRequest message) {
        System.out.println("Consumed LoginRequest message: " + message);
    }
}
