package com.github.francieudocosta.gerenciadorbenspatrimoniais.business.mapper;

import com.github.francieudocosta.gerenciadorbenspatrimoniais.controller.dto.in.UnidadeInDTO;
import com.github.francieudocosta.gerenciadorbenspatrimoniais.infrastructure.entities.Unidade;
import org.mapstruct.Mapper;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING)
public interface IUnidadeMapper {

    Unidade paraEntity(UnidadeInDTO unidade);
}
