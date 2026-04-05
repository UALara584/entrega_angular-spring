package com.example.demo.service;

import com.example.demo.entity.Tenista;
import com.example.demo.repository.TenistaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TenistaService {

    private final TenistaRepository tenistaRepository;

    public TenistaService(TenistaRepository tenistaRepository) {
        this.tenistaRepository = tenistaRepository;
    }

    public List<Tenista> obtenerTodos() {
        return tenistaRepository.findAll();
    }

    public Optional<Tenista> obtenerPorId(Long id) {
        return tenistaRepository.findById(id);
    }
}