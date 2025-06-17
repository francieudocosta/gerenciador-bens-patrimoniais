package com.github.francieudocosta.gerenciadorbenspatrimoniais.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Servidor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
