package br.com.gomide.hello.vo;

import java.time.LocalDateTime;

public class ReservaVO {

    private Long id;
    private String nomeCorte;
    private float valor;
    private LocalDateTime horario;
    private Long userId;  
    private Long barberId; 
    private String nomeBarbearia;
    private Long corteId;
    private LocalDateTime dataReserva;

    public ReservaVO() {}

    public ReservaVO(Long id, String nomeCorte, float valor, LocalDateTime horario, Long userId, Long barberId, String nomeBarbearia, Long corteId, LocalDateTime dataReserva) {
        this.id = id;
        this.nomeCorte = nomeCorte;
        this.valor = valor;
        this.horario = horario;
        this.userId = userId;
        this.barberId = barberId;
        this.nomeBarbearia = nomeBarbearia;
        this.corteId = corteId;
        this.dataReserva = dataReserva;
    }


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

    public String getNomeBarbearia() {
        return nomeBarbearia;
    }

    public void setNomeBarbearia(String nomeBarbearia) {
        this.nomeBarbearia = nomeBarbearia; 
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
