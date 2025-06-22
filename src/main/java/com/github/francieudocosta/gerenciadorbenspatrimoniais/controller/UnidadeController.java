package com.github.francieudocosta.gerenciadorbenspatrimoniais.controller;

import com.github.francieudocosta.gerenciadorbenspatrimoniais.business.UnidadeService;
import com.github.francieudocosta.gerenciadorbenspatrimoniais.controller.dto.in.UnidadeInDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/unidade")
public class UnidadeController {

    private final UnidadeService unidadeService;

    @PostMapping
    public ResponseEntity<Void> salvarUnidade(@RequestBody UnidadeInDTO unidade) {

        unidadeService.salvarNovaUnidade(unidade);

        return ResponseEntity.ok().build();
    }
}
