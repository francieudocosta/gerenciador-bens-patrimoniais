package com.github.francieudocosta.gerenciadorbenspatrimoniais.infrastructure.entities;

import com.github.francieudocosta.gerenciadorbenspatrimoniais.infrastructure.entities.enums.Subelemento;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "produto")
@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String espeficacao;
    private String unidadeMedida;

    @Enumerated(EnumType.STRING)
    private Subelemento subelemento;
}
