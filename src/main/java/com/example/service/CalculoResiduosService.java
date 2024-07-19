package com.example.service;

import com.example.domain.CalculoResiduos;
import com.example.dto.CalculoResiduosDTO;
import com.example.mapper.CalculoResiduosMapper;
import com.example.repository.CalculoResiduosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CalculoResiduosService {

    @Autowired
    private CalculoResiduosRepository calculoResiduosRepository;

    public CalculoResiduosDTO getCalculoResiduosById(Long id) {
        CalculoResiduos calculoResiduos = calculoResiduosRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cálculo de residuos no encontrado"));
        return CalculoResiduosMapper.INSTANCE.calculoResiduosToCalculoResiduosDTO(calculoResiduos);
    }

    public CalculoResiduosDTO saveCalculoResiduos(CalculoResiduosDTO calculoResiduosDTO) {
        CalculoResiduos calculoResiduos = CalculoResiduosMapper.INSTANCE.calculoResiduosDTOToCalculoResiduos(calculoResiduosDTO);
        calculoResiduos = calculoResiduosRepository.save(calculoResiduos);
        return CalculoResiduosMapper.INSTANCE.calculoResiduosToCalculoResiduosDTO(calculoResiduos);
    }

    public void deleteCalculoResiduos(Long id) {
        calculoResiduosRepository.deleteById(id);
    }

    public List<CalculoResiduosDTO> getAllCalculosResiduos() {
        List<CalculoResiduos> calculosResiduos = calculoResiduosRepository.findAll();
        return calculosResiduos.stream()
                .map(CalculoResiduosMapper.INSTANCE::calculoResiduosToCalculoResiduosDTO)
                .collect(Collectors.toList());
    }
}
