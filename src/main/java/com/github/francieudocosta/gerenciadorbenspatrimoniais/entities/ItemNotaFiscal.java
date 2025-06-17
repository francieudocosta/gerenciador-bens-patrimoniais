package com.github.francieudocosta.gerenciadorbenspatrimoniais.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/*
    cada item vira um bem patrimonial
*/
@Entity
@Data
public class ItemNotaFiscal implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "nota_fiscal_id")
    private NotaFiscal notaFiscal;

    @ManyToOne
    @JoinColumn(name = "produto_id")
    private Produto produto;

    private Integer quantidade;
    private BigDecimal valorUnitario;
    private BigDecimal valorTotal;

    @OneToMany(mappedBy = "itemNotaFiscal", cascade = CascadeType.ALL)
    private List<BemPatrimonial> bensGerados;
}
