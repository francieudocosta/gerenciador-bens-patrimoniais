package com.github.francieudocosta.gerenciadorbenspatrimoniais.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
public class Fornecedor implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String razaoSocial;
    private String cnpj;
    private String email;
    private String telefone;
    private String endereco;

    @OneToMany(mappedBy = "fornecedor")
    private List<NotaFiscal> notasfiscais;
}
