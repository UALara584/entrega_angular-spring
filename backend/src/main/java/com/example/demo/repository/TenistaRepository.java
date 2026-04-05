package com.example.demo.repository;

import com.example.demo.entity.Tenista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TenistaRepository extends JpaRepository<Tenista, Long> {
}