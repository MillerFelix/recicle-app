package com.usjt.recicle.app.model;

import java.time.LocalDateTime;

public class Anotacao {

    private Long id;
    private String descricao;
    private CategoriaResiduo categoriaResiduo;
    private LocalDateTime dataCriacao;

    public Anotacao() {
    }

    public Anotacao(Long id, String descricao, CategoriaResiduo categoriaResiduo, LocalDateTime dataCriacao) {
        this.id = id;
        this.descricao = descricao;
        this.categoriaResiduo = categoriaResiduo;
        this.dataCriacao = dataCriacao;
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

    public CategoriaResiduo getCategoriaResiduo() {
        return categoriaResiduo;
    }

    public void setCategoriaResiduo(CategoriaResiduo categoriaResiduo) {
        this.categoriaResiduo = categoriaResiduo;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}
