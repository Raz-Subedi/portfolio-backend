package com.raz.portfolio_backend.dto;

public record ProfileResponse(
         Long id,
         String name,
         String role,
         String bio,
         String email,
         String phone,
         String linkedinUrl,
         String githubUrl
) {
}
