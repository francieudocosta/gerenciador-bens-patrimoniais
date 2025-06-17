package com.github.francieudocosta.gerenciadorbenspatrimoniais.entities;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class Unidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "responsavel_id", nullable = false)
    private Servidor responsavel; //seria aqui o gestor atual da unidade

    @OneToMany(mappedBy = "unidade")
    private List<BemPatrimonial> bensPatrimoniais;
}
