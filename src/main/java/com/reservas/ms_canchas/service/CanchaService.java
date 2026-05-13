package com.reservas.ms_canchas.service;


import com.reservas.ms_canchas.model.Cancha;
import com.reservas.ms_canchas.repository.CanchaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CanchaService {

    @Autowired
    private CanchaRepository repository;

    // 1. Listar TODAS las canchas (CRUD Básico)
    public List<Cancha> listarTodas() {
        return repository.findAll();
    }

    // 2. Listar SOLO canchas activas (Operación Personalizada)
    public List<Cancha> listarCanchasActivas() {
        return repository.findByEstadoActivoTrue();
    }

    // 3. Crear o Actualizar una cancha (CRUD + Reglas de negocio)
    public Cancha guardar(@org.jetbrains.annotations.NotNull Cancha cancha) {
        // Validaciones de negocio exigidas por el profesor
        if (cancha.getNombre() == null || cancha.getNombre().isEmpty()) {
            throw new IllegalArgumentException("El nombre de la cancha es obligatorio.");
        }
        if (cancha.getPrecioPorHora() == null || cancha.getPrecioPorHora() < 0) {
            throw new IllegalArgumentException("El precio por hora no puede ser negativo.");
        }

        // Por defecto, si no le mandan estado, se crea activa
        if (cancha.getEstadoActivo() == null) {
            cancha.setEstadoActivo(true);
        }

        return repository.save(cancha);
    }

    // 4. Buscar por ID
    public Optional<Cancha> buscarPorId(Long id) {
        return repository.findById(id);
    }

    // 5. Eliminar (CRUD)
    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}