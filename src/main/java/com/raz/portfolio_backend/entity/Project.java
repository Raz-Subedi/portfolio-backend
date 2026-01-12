package com.raz.portfolio_backend.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Project extends BaseEntity{
    private String title;
    private String description;
    private String techStack;
    private String githubUrl;
    private String liveDemoUrl;
    private String imageUrl;
}
