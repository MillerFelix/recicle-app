package com.usjt.recicle.app.model;

public class Anotacao {

    private Long id;
    private String descricao;
    private Long idCategoriaResiduo;

    public Anotacao() {
    }

    public Anotacao(Long id, String descricao, Long idCategoriaResiduo) {
        this.id = id;
        this.descricao = descricao;
        this.idCategoriaResiduo = idCategoriaResiduo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Long getIdCategoriaResiduo() {
        return idCategoriaResiduo;
    }

    public void setIdCategoriaResiduo(Long idCategoriaResiduo) {
        this.idCategoriaResiduo = idCategoriaResiduo;
    }
}
