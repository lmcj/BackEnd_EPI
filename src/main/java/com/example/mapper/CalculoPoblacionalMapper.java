package com.example.mapper;

import com.example.domain.CalculoPoblacional;
import com.example.dto.CalculoPoblacionalDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CalculoPoblacionalMapper {
    CalculoPoblacionalMapper INSTANCE = Mappers.getMapper(CalculoPoblacionalMapper.class);

    @Mapping(source = "usuario.id_usuario", target = "usuarioId")
    @Mapping(source = "metodo.id_metodo", target = "metodoId")
    CalculoPoblacionalDTO calculoPoblacionalToCalculoPoblacionalDTO(CalculoPoblacional calculoPoblacional);

    @Mapping(source = "usuarioId", target = "usuario.id_usuario")
    @Mapping(source = "metodoId", target = "metodo.id_metodo")
    CalculoPoblacional calculoPoblacionalDTOToCalculoPoblacional(CalculoPoblacionalDTO calculoPoblacionalDTO);
}
