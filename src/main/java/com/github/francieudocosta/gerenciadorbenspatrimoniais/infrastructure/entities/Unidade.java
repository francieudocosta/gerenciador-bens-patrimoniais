package com.github.francieudocosta.gerenciadorbenspatrimoniais.infrastructure.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "unidade")
@Entity
public class Unidade {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String nome;

    private String descricao;

    @ManyToOne
    @JoinColumn(name = "responsavel_id", nullable = false)
    private Servidor responsavel; //seria aqui o gestor atual da unidade

    @OneToMany(mappedBy = "unidade")
    private List<BemPatrimonial> bensPatrimoniais;
}
