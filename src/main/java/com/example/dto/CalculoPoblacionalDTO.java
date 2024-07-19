package com.example.dto;

public class CalculoPoblacionalDTO {
    private Long id_calculo_poblacional;
    private Long usuarioId;
    private Long metodoId;
    private double resultado;

    // Getters y Setters
    public Long getId_calculo_poblacional() {
        return id_calculo_poblacional;
    }

    public void setId_calculo_poblacional(Long id_calculo_poblacional) {
        this.id_calculo_poblacional = id_calculo_poblacional;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Long getMetodoId() {
        return metodoId;
    }

    public void setMetodoId(Long metodoId) {
        this.metodoId = metodoId;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
