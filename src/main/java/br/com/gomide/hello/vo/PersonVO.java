package br.com.gomide.hello.vo;

import java.util.Date;

public class PersonVO {
    private Long id;
    private String usuario;
    private Date createdAt;

    public PersonVO() {
        this.createdAt = new Date();
    }

    public PersonVO(Long id, String usuario, String senha, String email) {
        this.id = id;
        this.usuario = usuario;
        this.createdAt = new Date();
    }
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }


    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
