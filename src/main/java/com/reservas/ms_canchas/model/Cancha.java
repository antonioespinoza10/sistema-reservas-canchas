package com.reservas.ms_canchas.model;

import jakarta.persistence.*;

@Entity
@Table(name = "canchas")
public class Cancha {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    private String tipoDeporte; // Ej: Fútbol, Tenis
    private String superficie;  // Ej: Pasto Sintético, Arcilla
    private Double precioPorHora;
    private Boolean estadoActivo;

    // Constructores vacíos obligatorios para Spring Boot
    public Cancha() {}

    // GETTERS Y SETTERS (Si usas la librería Lombok, puedes borrar todo esto de abajo y poner @Data arriba de la clase)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTipoDeporte() { return tipoDeporte; }
    public void setTipoDeporte(String tipoDeporte) { this.tipoDeporte = tipoDeporte; }

    public String getSuperficie() { return superficie; }
    public void setSuperficie(String superficie) { this.superficie = superficie; }

    public Double getPrecioPorHora() { return precioPorHora; }
    public void setPrecioPorHora(Double precioPorHora) { this.precioPorHora = precioPorHora; }

    public Boolean getEstadoActivo() { return estadoActivo; }
    public void setEstadoActivo(Boolean estadoActivo) { this.estadoActivo = estadoActivo; }
}