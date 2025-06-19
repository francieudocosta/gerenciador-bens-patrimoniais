package com.github.francieudocosta.gerenciadorbenspatrimoniais.controller;

import com.github.francieudocosta.gerenciadorbenspatrimoniais.business.ServidorService;
import com.github.francieudocosta.gerenciadorbenspatrimoniais.controller.dto.in.ServidorInDTO;
import com.github.francieudocosta.gerenciadorbenspatrimoniais.controller.dto.out.ServidorOutDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/servidor")
public class ServidorController {

    private final ServidorService servidorService;

    @PostMapping
    public ResponseEntity<ServidorOutDTO> salvarNovoServidor(@RequestBody ServidorInDTO servidorInDTO) {

        return ResponseEntity.ok(servidorService.salvarNovoServidor(servidorInDTO));
    }
}
