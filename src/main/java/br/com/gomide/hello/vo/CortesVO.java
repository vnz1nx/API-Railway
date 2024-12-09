package br.com.gomide.hello.vo;


public class CortesVO {
    private Long id;
    private String nomeCorte;
    private Integer valor;
    private String tempo;
    private String imagem;

    public CortesVO(Long id, String nomeCorte, Integer valor, String tempo, String imagem) {
        this.id = id;
        this.nomeCorte = nomeCorte;
        this.valor = valor;
        this.tempo = tempo;
        this.imagem = imagem;
    }
    
    public CortesVO() {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
