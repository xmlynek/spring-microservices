package com.filip.clients.notification;

public record NotificationRequest(
        Integer customerId,
        String customerEmail,
        String message
) {

}
