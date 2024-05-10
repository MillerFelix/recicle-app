package com.usjt.recicle.app.models;

import java.util.List;

public class CategoriaResiduo {

    private String nome;
    private String descricao;
    private List<Residuo> residuos;

    public CategoriaResiduo() {
    }

    public CategoriaResiduo(String nome, String descricao, List<Residuo> residuos) {
        this.nome = nome;
        this.descricao = descricao;
        this.residuos = residuos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Residuo> getResiduos() {
        return residuos;
    }

    public void setResiduos(List<Residuo> residuos) {
        this.residuos = residuos;
    }
}
