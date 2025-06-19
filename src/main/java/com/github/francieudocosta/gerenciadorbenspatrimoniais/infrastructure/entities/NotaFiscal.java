package com.github.francieudocosta.gerenciadorbenspatrimoniais.infrastructure.entities;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "nota_fiscal")
@Entity
public class NotaFiscal implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
