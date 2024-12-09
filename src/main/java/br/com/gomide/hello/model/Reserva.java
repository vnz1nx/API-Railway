package br.com.gomide.hello.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "reserva")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_corte", nullable = false, length = 80)
    private String nomeCorte;

    @Column(name = "nomebarbearia", nullable = false, length = 80)
    private String nomeBarbearia;

    @Column(name = "valor", nullable = false)
    private float valor;

    @Column(name = "horario", nullable = false)
    private LocalDateTime horario;

    @Column(name = "user_id", nullable = false) 
    private Long userId;

    @Column(name = "barber_id", nullable = false)
    private Long barberId;

    @Column(name = "corte_id", nullable = false)
    private Long corteId;

    @Column(name = "data_reserva", nullable = false)
    private LocalDateTime dataReserva;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCorte() {
        return nomeCorte;
    }

    public void setNomeCorte(String nomeCorte) {
        this.nomeCorte = nomeCorte;
    }

    public String getNomeBarbearia() {
        return nomeBarbearia;
    }

    public void setNomeBarbearia(String nomeBarbearia) {
        this.nomeBarbearia = nomeBarbearia;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getBarberId() {
        return barberId;
    }

    public void setBarberId(Long barberId) {
        this.barberId = barberId;
    }

    public Long getCorteId() {
        return corteId;
    }

    public void setCorteId(Long corteId) {
        this.corteId = corteId;
    }

    public LocalDateTime getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(LocalDateTime dataReserva) {
        this.dataReserva = dataReserva;
    }
}
