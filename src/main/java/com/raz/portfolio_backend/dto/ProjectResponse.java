package com.raz.portfolio_backend.dto;

public record ProjectResponse(
         Long id,
         String title,
         String description,
         String techStack,
         String githubUrl,
         String liveDemoUrl,
         String imageUrl
) {
}
