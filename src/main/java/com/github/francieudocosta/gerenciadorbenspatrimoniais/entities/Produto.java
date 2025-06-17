package com.github.francieudocosta.gerenciadorbenspatrimoniais.entities;

import com.github.francieudocosta.gerenciadorbenspatrimoniais.entities.enums.Subelemento;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String espeficacao;
    private String unidadeMedida;

    @Enumerated(EnumType.STRING)
    private Subelemento subelemento;
}
