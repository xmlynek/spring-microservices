package com.filip.customer;

public record CustomerRequest(
        String firstName,
        String lastName,
        String email) {
}
