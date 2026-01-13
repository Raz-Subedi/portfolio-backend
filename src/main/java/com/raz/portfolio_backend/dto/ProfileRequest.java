package com.raz.portfolio_backend.dto;

import lombok.Data;

@Data
public class ProfileRequest {
    private String name;
    private String role;
    private String bio;
    private String email;
    private String phone;
    private String linkedinUrl;
    private String githubUrl;
}