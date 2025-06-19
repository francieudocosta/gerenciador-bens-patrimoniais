package com.github.francieudocosta.gerenciadorbenspatrimoniais.infrastructure.entities;

import com.github.francieudocosta.gerenciadorbenspatrimoniais.infrastructure.entities.enums.EstadoConservacao;
import jakarta.persistence.*;
import lombok.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "bem_patrimonial")
@Entity
public class BemPatrimonial implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String descricao;
    private String numeroTombo;

    @Enumerated(EnumType.STRING)
    private EstadoConservacao estadoConservacao;

    @ManyToOne
    @JoinColumn(name = "item_nota_fiscal_id")
    private ItemNotaFiscal itemNotaFiscal;

    @ManyToOne
    private Unidade unidade;

    @ManyToOne
    private Servidor responsavel;

    @ManyToMany(mappedBy = "bens")
    private Set<Movimentacao> movimentacoes = new HashSet<>();

    @PrePersist
    private void setResponsavel(){

        if(this.unidade != null){
            this.responsavel = this.unidade.getResponsavel();
        }
    }
}
