package com.reservas.ms_usuarios.repository;

import com.reservas.ms_usuarios.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
