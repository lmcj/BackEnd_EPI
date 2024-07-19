package com.example.service;

import com.example.domain.Usuario;
import com.example.dto.UsuarioDTO;
import com.example.mapper.UsuarioMapper;
import com.example.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public UsuarioDTO getUsuarioById(Long id) {
        Usuario usuario = usuarioRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
        return UsuarioMapper.INSTANCE.usuarioToUsuarioDTO(usuario);
    }

    public UsuarioDTO saveUsuario(UsuarioDTO usuarioDTO) {
        Usuario usuario = UsuarioMapper.INSTANCE.usuarioDTOToUsuario(usuarioDTO);
        usuario = usuarioRepository.save(usuario);
        return UsuarioMapper.INSTANCE.usuarioToUsuarioDTO(usuario);
    }

    public void deleteUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }

    public List<UsuarioDTO> getAllUsuarios() {
        List<Usuario> usuarios = usuarioRepository.findAll();
        return usuarios.stream()
                .map(UsuarioMapper.INSTANCE::usuarioToUsuarioDTO)
                .collect(Collectors.toList());
    }
}
