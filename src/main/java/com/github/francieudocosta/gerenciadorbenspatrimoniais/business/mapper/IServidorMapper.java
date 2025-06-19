package com.github.francieudocosta.gerenciadorbenspatrimoniais.business.mapper;

import com.github.francieudocosta.gerenciadorbenspatrimoniais.controller.dto.in.ServidorInDTO;
import com.github.francieudocosta.gerenciadorbenspatrimoniais.controller.dto.out.ServidorOutDTO;
import com.github.francieudocosta.gerenciadorbenspatrimoniais.infrastructure.entities.Servidor;
import org.mapstruct.Mapper;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING)
public interface IServidorMapper {

    Servidor paraEntity(ServidorInDTO servidor);

    ServidorOutDTO paraOut(Servidor servidor);
}
