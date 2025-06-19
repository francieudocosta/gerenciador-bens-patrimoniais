package com.github.francieudocosta.gerenciadorbenspatrimoniais.infrastructure.entities;

import com.github.francieudocosta.gerenciadorbenspatrimoniais.infrastructure.entities.enums.TipoMovimentacao;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "movimentacao")
@Entity
public class Movimentacao implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToMany
    @JoinTable(name = "movimentacao_bem",
        joinColumns = @JoinColumn(name = "movimentacao_id"),
        inverseJoinColumns = @JoinColumn(name = "bem_id"))
    private Set<BemPatrimonial> bens = new HashSet<>();

    @ManyToOne
    private Unidade unidadeOrigem;

    @ManyToOne
    private Unidade unidadeDestino;

    @ManyToOne
    private Servidor responsavel;

    private LocalDate dataMovimentacao;

    @Enumerated(EnumType.STRING)
    private TipoMovimentacao tipoMovimentacao;

    @PrePersist
    private void setResponsavel(){

        if(this.unidadeDestino != null){
            this.responsavel = this.unidadeDestino.getResponsavel();
        }
    }
}
