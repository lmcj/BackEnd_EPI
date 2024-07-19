package com.example.controller;

import com.example.dto.CalculoResiduosDTO;
import com.example.service.CalculoResiduosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/calculos-residuos")
public class CalculoResiduosController {

    @Autowired
    private CalculoResiduosService calculoResiduosService;

    @GetMapping("/{id}")
    public CalculoResiduosDTO getCalculoResiduosById(@PathVariable Long id) {
        return calculoResiduosService.getCalculoResiduosById(id);
    }

    @PostMapping
    public CalculoResiduosDTO createCalculoResiduos(@RequestBody CalculoResiduosDTO calculoResiduosDTO) {
        return calculoResiduosService.saveCalculoResiduos(calculoResiduosDTO);
    }

    @PutMapping("/{id}")
    public CalculoResiduosDTO updateCalculoResiduos(@PathVariable Long id, @RequestBody CalculoResiduosDTO calculoResiduosDTO) {
        calculoResiduosDTO.setId_calculo_residuos(id);
        return calculoResiduosService.saveCalculoResiduos(calculoResiduosDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteCalculoResiduos(@PathVariable Long id) {
        calculoResiduosService.deleteCalculoResiduos(id);
    }

    @GetMapping
    public List<CalculoResiduosDTO> getAllCalculosResiduos() {
        return calculoResiduosService.getAllCalculosResiduos();
    }
}
