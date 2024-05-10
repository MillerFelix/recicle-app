package com.usjt.recicle.app.models;

import java.time.LocalDateTime;

public class Anotação {

    private String descricao;
    private CategoriaResiduo categoriaResiduo;
    private LocalDateTime dataCriacao;

    public Anotação() {
    }

    public Anotação(String descricao, CategoriaResiduo categoriaResiduo, LocalDateTime dataCriacao) {
        this.descricao = descricao;
        this.categoriaResiduo = categoriaResiduo;
        this.dataCriacao = dataCriacao;
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
