package com.usjt.recicle.app.model;

public class Dica {

    private String titulo;
    private String descricao;
    private String categoriaResiduo;

    public Dica() {
    }

    public Dica(String titulo, String descricao, String categoriaResiduo) {
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

    public String getCategoriaResiduo() {
        return categoriaResiduo;
    }

    public void setCategoriaResiduo(String categoriaResiduo) {
        this.categoriaResiduo = categoriaResiduo;
    }
}
