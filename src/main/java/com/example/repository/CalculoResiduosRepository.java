package com.example.repository;

import com.example.domain.CalculoResiduos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalculoResiduosRepository extends JpaRepository<CalculoResiduos, Long> {
}
