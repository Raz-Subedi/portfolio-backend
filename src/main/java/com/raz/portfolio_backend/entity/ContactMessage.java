package com.raz.portfolio_backend.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContactMessage extends BaseEntity {
    private String name;
    private String email;
    private String subject;
    private String message;
    private LocalDateTime receivedAt;
}
