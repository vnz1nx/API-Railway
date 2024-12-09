package br.com.gomide.hello.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "barber")
public class Barber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_barbearia", nullable = false, length = 255)
    private String nomeBarbearia;

    @Column(name = "distancia", nullable = false, length = 255)
    private String distancia;

    @Column(name = "imagem", length = 255)
    private String imagem;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeBarbearia() {
        return nomeBarbearia;
    }

    public void setNomeBarbearia(String nomeBarbearia) {
        this.nomeBarbearia = nomeBarbearia;
    }

    public String getDistancia() {
        return distancia;
    }

    public void setDistancia(String distancia) {
        this.distancia = distancia;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    @Override
    public String toString() {
        return "Barber{" +
                "id=" + id +
                ", nomeBarbearia='" + nomeBarbearia + '\'' +
                ", distancia='" + distancia + '\'' +
                ", imagem='" + imagem + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Barber)) return false;
        Barber barber = (Barber) o;
        return id != null && id.equals(barber.id);
    }

    @Override
    public int hashCode() {
        return 31;
    }
}
