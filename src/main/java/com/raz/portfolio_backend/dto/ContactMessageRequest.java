package com.raz.portfolio_backend.dto;

import lombok.Data;

@Data
public class ContactMessageRequest {
    private String name;
    private String email;
    private String subject;
    private String message;
}
