package com.raz.portfolio_backend.dto;

public record SkillResponse(
        Long id,
        String name,
        String type,
        Integer proficiency
) {
}
