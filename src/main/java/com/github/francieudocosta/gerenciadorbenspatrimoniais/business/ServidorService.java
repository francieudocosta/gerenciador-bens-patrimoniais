package com.github.francieudocosta.gerenciadorbenspatrimoniais.business;

import com.github.francieudocosta.gerenciadorbenspatrimoniais.business.mapper.IServidorMapper;
import com.github.francieudocosta.gerenciadorbenspatrimoniais.controller.dto.in.ServidorInDTO;
import com.github.francieudocosta.gerenciadorbenspatrimoniais.controller.dto.out.ServidorOutDTO;
import com.github.francieudocosta.gerenciadorbenspatrimoniais.infrastructure.repository.ServidorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ServidorService {

    private final ServidorRepository servidorRepository;
    private final IServidorMapper servidorMapper;

    public ServidorOutDTO salvarNovoServidor(ServidorInDTO servidorInDTO) {

        return servidorMapper.paraOut(
                servidorRepository.save(servidorMapper.paraEntity(servidorInDTO))
        );
    }
}
