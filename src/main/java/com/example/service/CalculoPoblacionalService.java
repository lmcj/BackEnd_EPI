package com.example.service;

import com.example.domain.CalculoPoblacional;
import com.example.dto.CalculoPoblacionalDTO;
import com.example.mapper.CalculoPoblacionalMapper;
import com.example.repository.CalculoPoblacionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CalculoPoblacionalService {

    @Autowired
    private CalculoPoblacionalRepository calculoPoblacionalRepository;

    public CalculoPoblacionalDTO getCalculoPoblacionalById(Long id) {
        CalculoPoblacional calculoPoblacional = calculoPoblacionalRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cálculo poblacional no encontrado"));
        return CalculoPoblacionalMapper.INSTANCE.calculoPoblacionalToCalculoPoblacionalDTO(calculoPoblacional);
    }

    public CalculoPoblacionalDTO saveCalculoPoblacional(CalculoPoblacionalDTO calculoPoblacionalDTO) {
        CalculoPoblacional calculoPoblacional = CalculoPoblacionalMapper.INSTANCE.calculoPoblacionalDTOToCalculoPoblacional(calculoPoblacionalDTO);
        calculoPoblacional = calculoPoblacionalRepository.save(calculoPoblacional);
        return CalculoPoblacionalMapper.INSTANCE.calculoPoblacionalToCalculoPoblacionalDTO(calculoPoblacional);
    }

    public void deleteCalculoPoblacional(Long id) {
        calculoPoblacionalRepository.deleteById(id);
    }

    public List<CalculoPoblacionalDTO> getAllCalculosPoblacionales() {
        List<CalculoPoblacional> calculosPoblacionales = calculoPoblacionalRepository.findAll();
        return calculosPoblacionales.stream()
                .map(CalculoPoblacionalMapper.INSTANCE::calculoPoblacionalToCalculoPoblacionalDTO)
                .collect(Collectors.toList());
    }
}
