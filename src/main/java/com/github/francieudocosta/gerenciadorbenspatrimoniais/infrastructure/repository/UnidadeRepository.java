package com.github.francieudocosta.gerenciadorbenspatrimoniais.infrastructure.repository;

import com.github.francieudocosta.gerenciadorbenspatrimoniais.infrastructure.entities.Unidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UnidadeRepository extends JpaRepository<Unidade, Long> {
}
