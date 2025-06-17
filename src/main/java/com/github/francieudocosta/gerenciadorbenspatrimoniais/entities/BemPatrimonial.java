package com.github.francieudocosta.gerenciadorbenspatrimoniais.entities;

import com.github.francieudocosta.gerenciadorbenspatrimoniais.entities.enums.EstadoConservacao;
import jakarta.persistence.*;
import lombok.Data;
import java.io.Serial;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class BemPatrimonial implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
