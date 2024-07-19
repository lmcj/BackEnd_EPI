package com.example.dto;

import java.sql.Timestamp;

public class UsuarioDTO {
    private Long id_usuario;
    private Long personaId;
    private Long rolId;
    private Long credencialId;
    private String estado;
    private Timestamp fecha_registro;

    // Getters y Setters
    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Long getPersonaId() {
        return personaId;
    }

    public void setPersonaId(Long personaId) {
        this.personaId = personaId;
    }

    public Long getRolId() {
        return rolId;
    }

    public void setRolId(Long rolId) {
        this.rolId = rolId;
    }

    public Long getCredencialId() {
        return credencialId;
    }

    public void setCredencialId(Long credencialId) {
        this.credencialId = credencialId;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Timestamp getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Timestamp fecha_registro) {
        this.fecha_registro = fecha_registro;
    }
}
