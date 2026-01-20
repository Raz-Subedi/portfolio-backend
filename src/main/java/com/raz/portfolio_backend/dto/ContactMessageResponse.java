package com.raz.portfolio_backend.dto;

public record ContactMessageResponse(
        Long id,
        String name,
        String email,
        String subject,
        String message
) {
}
