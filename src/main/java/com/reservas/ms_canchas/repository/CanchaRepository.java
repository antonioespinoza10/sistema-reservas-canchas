package com.reservas.ms_canchas.repository;

import com.reservas.ms_canchas.model.Cancha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface CanchaRepository extends JpaRepository<Cancha, Long> {

    // Operación personalizada 1: Buscar solo canchas disponibles/activas
    List<Cancha> findByEstadoActivoTrue();

    // Operación personalizada 2: Buscar canchas por el tipo de deporte
    List<Cancha> findByTipoDeporte(String tipoDeporte);
}



