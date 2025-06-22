package com.github.francieudocosta.gerenciadorbenspatrimoniais.controller.dto.in;

public record UnidadeInDTO(

        String nome,
        String descricao,
        Long servidorResponsavelId
) { }
