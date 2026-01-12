package com.raz.portfolio_backend.repository;

import com.raz.portfolio_backend.entity.ContactMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactMessageRepository extends JpaRepository<ContactMessage,Long> {
}
