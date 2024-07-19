package com.example.repository;

import com.example.domain.CalculoPoblacional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalculoPoblacionalRepository extends JpaRepository<CalculoPoblacional, Long> {
}

