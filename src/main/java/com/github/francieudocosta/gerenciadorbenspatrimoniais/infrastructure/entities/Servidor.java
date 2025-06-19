package com.github.francieudocosta.gerenciadorbenspatrimoniais.infrastructure.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "servidor")
@Entity
public class Servidor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private Integer matricula;
    private String cpf;

    @OneToOne(mappedBy = "servidor")
    private Usuario usuario;

    @OneToMany(mappedBy = "responsavel")
    private List<Unidade> unidades;

    @OneToMany(mappedBy = "responsavel")
    private List<BemPatrimonial> bemPatrimonials;
}
