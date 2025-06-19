package com.github.francieudocosta.gerenciadorbenspatrimoniais.infrastructure.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "fornecedor")
@Entity
public class Fornecedor implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String razaoSocial;
    private String cnpj;
    private String email;
    private String telefone;
    private String endereco;

    @OneToMany(mappedBy = "fornecedor")
    private List<NotaFiscal> notasfiscais;
}
