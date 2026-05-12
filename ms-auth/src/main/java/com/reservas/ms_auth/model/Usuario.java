package com.reservas.ms_auth.model;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "usuarios_auth")
@Data
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
}