package com.raz.portfolio_backend.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Profile extends BaseEntity{

    private String name;
    private String role;
    private String bio;
    private String email;
    private String phone;
    private String linkedinUrl;
    private String githubUrl;
}
