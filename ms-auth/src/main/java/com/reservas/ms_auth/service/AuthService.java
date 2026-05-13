package com.reservas.ms_auth.service;
import com.reservas.ms_auth.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public String login(String user, String pass) {
        return usuarioRepository.findByUsername(user)
                .filter(u -> u.getPassword().equals(pass))
                .map(u -> "Login exitoso para: " + u.getUsername())
                .orElse("Usuario o contraseña incorrectos");
    }
}