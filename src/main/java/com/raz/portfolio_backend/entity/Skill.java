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
public class Skill extends BaseEntity{
    private String name;
    private String type;
    private Integer proficiency;
}
