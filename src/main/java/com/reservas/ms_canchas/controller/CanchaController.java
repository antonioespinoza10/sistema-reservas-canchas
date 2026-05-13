package com.reservas.ms_canchas.controller;

import com.reservas.ms_canchas.model.Cancha;
import com.reservas.ms_canchas.service.CanchaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/canchas")
public class CanchaController {

    @Autowired
    private CanchaService service;

    // GET: http://localhost:8081/api/canchas
    @GetMapping
    public List<Cancha> listar() {
        return service.listarTodas();
    }

    // GET: http://localhost:8081/api/canchas/activas
    @GetMapping("/activas")
    public List<Cancha> listarActivas() {
        return service.listarCanchasActivas();
    }

    // POST: http://localhost:8081/api/canchas
    @PostMapping
    public Cancha crear(@RequestBody Cancha cancha) {
        return service.guardar(cancha);
    }

    // DELETE: http://localhost:8081/api/canchas/1
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}
