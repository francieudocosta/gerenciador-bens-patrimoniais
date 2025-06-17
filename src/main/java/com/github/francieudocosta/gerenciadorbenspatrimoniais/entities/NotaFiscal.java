package com.github.francieudocosta.gerenciadorbenspatrimoniais.entities;

import jakarta.persistence.*;
import lombok.Data;
import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class NotaFiscal implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numero;
    private String serie;
    private LocalDate dataEmissao;

    @ManyToOne
    @JoinColumn(name = "fornecedor_id")
    private Fornecedor fornecedor;

    @OneToMany(mappedBy = "notaFiscal", cascade = CascadeType.ALL)
    private List<ItemNotaFiscal> itens;
}
