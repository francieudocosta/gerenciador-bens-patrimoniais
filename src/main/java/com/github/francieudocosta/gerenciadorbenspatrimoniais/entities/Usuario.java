package com.github.francieudocosta.gerenciadorbenspatrimoniais.entities;

import com.github.francieudocosta.gerenciadorbenspatrimoniais.entities.enums.UserRole;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Data
public class Usuario implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;

    private boolean enabled = true;

    @Enumerated(EnumType.STRING)
    private UserRole role;

    @OneToOne
    @JoinColumn(name = "servidor_id", unique = true, nullable = false)
    private Servidor servidor;
}
