package com.raz.portfolio_backend.repository;

import com.raz.portfolio_backend.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project,Long> {
}
