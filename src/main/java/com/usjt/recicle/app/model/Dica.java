package com.usjt.recicle.app.model;

public class Dica {

    private Long id;
    private String titulo;
    private String descricao;
    private CategoriaResiduo categoriaResiduo;

    public Dica() {
    }

    public Dica(String titulo, String descricao, CategoriaResiduo categoriaResiduo) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.categoriaResiduo = categoriaResiduo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
}
