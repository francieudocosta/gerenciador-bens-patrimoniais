package com.github.francieudocosta.gerenciadorbenspatrimoniais.infrastructure.entities;

import com.github.francieudocosta.gerenciadorbenspatrimoniais.infrastructure.entities.enums.UserRole;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "usuario")
@Entity
public class Usuario implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
