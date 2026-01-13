package com.raz.portfolio_backend.dto;

public record ProfileResponse(
         String name,
         String role,
         String bio,
         String email,
         String phone,
         String linkedinUrl,
         String githubUrl
) {
}
