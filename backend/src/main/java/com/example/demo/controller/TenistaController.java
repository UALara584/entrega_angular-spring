package com.example.demo.controller;


import com.example.demo.entity.Tenista;
import com.example.demo.service.TenistaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tenistas")
@CrossOrigin(origins = "*")
public class TenistaController {

    private final TenistaService tenistaService;

    public TenistaController(TenistaService tenistaService) {
        this.tenistaService = tenistaService;
    }

    @GetMapping
    public List<Tenista> getAllTenistas() {
        return tenistaService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Tenista getTenistaById(@PathVariable Long id) {
        return tenistaService.obtenerPorId(id).orElse(null);
    }
}