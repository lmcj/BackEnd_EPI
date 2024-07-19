package com.example.controller;

import com.example.dto.CredencialDTO;
import com.example.service.CredencialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/credenciales")
public class CredencialController {

    @Autowired
    private CredencialService credencialService;

    @GetMapping("/{id}")
    public CredencialDTO getCredencialById(@PathVariable Long id) {
        return credencialService.getCredencialById(id);
    }

    @PostMapping
    public CredencialDTO createCredencial(@RequestBody CredencialDTO credencialDTO) {
        return credencialService.saveCredencial(credencialDTO);
    }

    @PutMapping("/{id}")
    public CredencialDTO updateCredencial(@PathVariable Long id, @RequestBody CredencialDTO credencialDTO) {
        credencialDTO.setId_credencial(id);
        return credencialService.saveCredencial(credencialDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteCredencial(@PathVariable Long id) {
        credencialService.deleteCredencial(id);
    }

    @GetMapping
    public List<CredencialDTO> getAllCredenciales() {
        return credencialService.getAllCredenciales();
    }
}
