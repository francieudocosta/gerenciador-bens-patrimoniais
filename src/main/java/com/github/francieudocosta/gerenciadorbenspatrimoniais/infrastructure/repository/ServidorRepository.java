package com.github.francieudocosta.gerenciadorbenspatrimoniais.infrastructure.repository;

import com.github.francieudocosta.gerenciadorbenspatrimoniais.infrastructure.entities.Servidor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServidorRepository extends JpaRepository<Servidor, Long> {
}
