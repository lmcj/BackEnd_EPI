package com.example.dto;

public class CalculoResiduosDTO {
    private Long id_calculo_residuos;
    private Long usuarioId;
    private Long metodoId;
    private double resultado;

    // Getters y Setters
    public Long getId_calculo_residuos() {
        return id_calculo_residuos;
    }

    public void setId_calculo_residuos(Long id_calculo_residuos) {
        this.id_calculo_residuos = id_calculo_residuos;
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
