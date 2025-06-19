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

    @Column(nullable = false)
    private String nome;

    @Column(unique = true, nullable = false)
    private Integer matricula;

    @Column(unique = true)
    private String cpf;

    @OneToOne(mappedBy = "servidor")
    private Usuario usuario;

    @OneToMany(mappedBy = "responsavel")
    private List<Unidade> unidades;

    @OneToMany(mappedBy = "responsavel")
    private List<BemPatrimonial> bemPatrimonials;
}
