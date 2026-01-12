package com.raz.portfolio_backend.repository;

import com.raz.portfolio_backend.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
}
