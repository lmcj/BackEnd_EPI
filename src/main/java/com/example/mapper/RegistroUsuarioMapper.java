package com.example.mapper;

import com.example.domain.Persona;
import com.example.domain.Credencial;
import com.example.domain.Usuario;
import com.example.dto.RegistroUsuarioDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.mapstruct.ReportingPolicy;

@Mapper(uses = DateMapper.class, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RegistroUsuarioMapper {
    RegistroUsuarioMapper INSTANCE = Mappers.getMapper(RegistroUsuarioMapper.class);

    @Mapping(source = "tipoDocumentos", target = "tipo_documentos")
    @Mapping(source = "numeroDocumento", target = "numero_documento")
    @Mapping(source = "fechaNacimiento", target = "fecha_nacimiento")
    @Mapping(target = "id_persona", ignore = true) // Ignorar id_persona
    Persona registroUsuarioDTOToPersona(RegistroUsuarioDTO registroUsuarioDTO);

    @Mapping(source = "email", target = "email")
    @Mapping(source = "contraseña", target = "contraseña")
    @Mapping(target = "id_credencial", ignore = true) // Ignorar id_credencial
    Credencial registroUsuarioDTOToCredencial(RegistroUsuarioDTO registroUsuarioDTO);

    @Mapping(target = "id_usuario", ignore = true) // Ignorar id_usuario
    @Mapping(target = "persona", ignore = true) // Ignorar persona, se asignará manualmente
    @Mapping(target = "rol", ignore = true) // Ignorar rol, se asignará manualmente
    @Mapping(target = "credencial", ignore = true) // Ignorar credencial, se asignará manualmente
    Usuario registroUsuarioDTOToUsuario(RegistroUsuarioDTO registroUsuarioDTO);
}
