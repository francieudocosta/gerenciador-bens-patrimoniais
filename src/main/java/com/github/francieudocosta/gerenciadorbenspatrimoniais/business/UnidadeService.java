package com.github.francieudocosta.gerenciadorbenspatrimoniais.business;

import com.github.francieudocosta.gerenciadorbenspatrimoniais.business.mapper.IUnidadeMapper;
import com.github.francieudocosta.gerenciadorbenspatrimoniais.controller.dto.in.UnidadeInDTO;
import com.github.francieudocosta.gerenciadorbenspatrimoniais.infrastructure.entities.Servidor;
import com.github.francieudocosta.gerenciadorbenspatrimoniais.infrastructure.entities.Unidade;
import com.github.francieudocosta.gerenciadorbenspatrimoniais.infrastructure.repository.ServidorRepository;
import com.github.francieudocosta.gerenciadorbenspatrimoniais.infrastructure.repository.UnidadeRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UnidadeService {

    private final UnidadeRepository unidadeRepository;
    private final ServidorRepository servidorRepository;
    private final IUnidadeMapper unidadeMapper;

    public void salvarNovaUnidade(UnidadeInDTO unidadeDTO) {

        Servidor servidor = servidorRepository.findById(unidadeDTO.servidorResponsavelId())
                .orElseThrow(() -> new EntityNotFoundException("Servidor não encontrado"));

        Unidade unidade = unidadeMapper.paraEntity(unidadeDTO);
        unidade.setResponsavel(servidor);

        unidadeRepository.save(unidade);
    }
}
