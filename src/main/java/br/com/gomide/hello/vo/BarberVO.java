package br.com.gomide.hello.vo;


public class BarberVO {
    private Long id;
    private String nomeBarbearia;
    private String distancia;
    private String imagem;

    public BarberVO(Long id, String nomeBarbearia, String distancia, String imagem) {
        this.id = id;
        this.nomeBarbearia = nomeBarbearia;
        this.distancia = distancia;
        this.imagem = imagem;
    }
    
    public BarberVO() {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
