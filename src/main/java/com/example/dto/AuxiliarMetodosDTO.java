package com.example.dto;

public class AuxiliarMetodosDTO {
    private Long id_auxiliar_metodos;
    private Long metodoId;
    private int año;
    private double valor;
    private String nombre_metodo;

    // Getters y Setters
    public Long getId_auxiliar_metodos() {
        return id_auxiliar_metodos;
    }

    public void setId_auxiliar_metodos(Long id_auxiliar_metodos) {
        this.id_auxiliar_metodos = id_auxiliar_metodos;
    }

    public Long getMetodoId() {
        return metodoId;
    }

    public void setMetodoId(Long metodoId) {
        this.metodoId = metodoId;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNombre_metodo() {
        return nombre_metodo;
    }

    public void setNombre_metodo(String nombre_metodo) {
        this.nombre_metodo = nombre_metodo;
    }
}
