package br.com.gomide.hello.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "cortes")
public class Cortes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nomecorte", nullable = false, length = 50) 
    private String nomeCorte;

    @Column(name = "valor", nullable = false)
    private Integer valor;

    @Column(name = "tempo", nullable = false, length = 50)
    private String tempo;

    @Column(name = "imagem", length = 255)
    private String imagem;

    @ManyToOne
    @JoinColumn(name = "barber_id")
    private Barber barbearia;

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

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public Barber getBarbearia() {
        return barbearia;
    }

    public void setBarbearia(Barber barbearia) {
        this.barbearia = barbearia;
    }
}
