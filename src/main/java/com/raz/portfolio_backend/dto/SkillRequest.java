package com.raz.portfolio_backend.dto;

import lombok.Data;

@Data
public class SkillRequest {
    private String name;
    private String type;
    private Integer proficiency;
}
