package com.example.service;

import com.example.domain.Persona;
import com.example.domain.Credencial;
import com.example.domain.Usuario;
import com.example.dto.RegistroUsuarioDTO;
import com.example.mapper.RegistroUsuarioMapper;
import com.example.repository.PersonaRepository;
import com.example.repository.CredencialRepository;
import com.example.repository.RolRepository;
import com.example.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.Date;

@Service
public class RegistroUsuarioService {

    @Autowired
    private PersonaRepository personaRepository;

    @Autowired
    private CredencialRepository credencialRepository;

    @Autowired
    private RolRepository rolRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Transactional
    public Usuario registrarUsuario(RegistroUsuarioDTO registroUsuarioDTO) {
        // Usar el mapper para convertir DTO a entidades
        Persona persona = RegistroUsuarioMapper.INSTANCE.registroUsuarioDTOToPersona(registroUsuarioDTO);
        Credencial credencial = RegistroUsuarioMapper.INSTANCE.registroUsuarioDTOToCredencial(registroUsuarioDTO);
        Usuario usuario = RegistroUsuarioMapper.INSTANCE.registroUsuarioDTOToUsuario(registroUsuarioDTO);

        // Guardar Persona
        persona = personaRepository.save(persona);

        // Guardar Credencial
        credencial.setEmail(persona.getEmail()); // Usar el mismo email de Persona
        credencial = credencialRepository.save(credencial);

        // Configurar y guardar Usuario
        usuario.setPersona(persona);
        usuario.setRol(rolRepository.findById(registroUsuarioDTO.getRolId()).orElseThrow(() -> new RuntimeException("Rol no encontrado")));
        usuario.setCredencial(credencial);

        // Establecer la fecha de registro actual
        usuario.setFecha_registro(new Timestamp(new Date().getTime()));

        return usuarioRepository.save(usuario);
    }
}

