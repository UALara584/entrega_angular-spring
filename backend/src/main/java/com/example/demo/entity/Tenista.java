package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tenistas")
public class Tenista {

    @Id
    private Long id;
    private String nombre;
    private String pais;
    private Integer ranking;
    private Integer puntos;
    private Integer movimiento;

    public Tenista() {
    }

    public Tenista(Long id, String nombre, String pais, Integer ranking, Integer puntos, Integer movimiento) {
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
        this.ranking = ranking;
        this.puntos = puntos;
        this.movimiento = movimiento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    public Integer getPuntos() {
        return puntos;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }

    public Integer getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(Integer movimiento) {
        this.movimiento = movimiento;
    }
}