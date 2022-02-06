package com.filip.notification;

import com.filip.clients.notification.NotificationRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@AllArgsConstructor
@Service
public class NotificationService {
    private NotificationRepository notificationRepository;

    @Transactional
    public void sendNotification(NotificationRequest notificationRequest) {
        Notification notification = Notification.builder()
                .customerId(notificationRequest.customerId())
                .customerEmail(notificationRequest.customerEmail())
                .sender("FilipMicroservices")
                .message(notificationRequest.message())
                .sentAt(LocalDateTime.now())
                .build();

        notificationRepository.saveAndFlush(notification);
    }
}
