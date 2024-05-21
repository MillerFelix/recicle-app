package com.usjt.recicle.app.model;

import com.usjt.recicle.app.dao.CategoriaResiduoDAO;
import java.util.List;

public class CategoriaResiduo {

    private Long id;
    private String nome;
    private String descricao;
    private List<Residuo> residuos;

    public CategoriaResiduo() {
    }

    public CategoriaResiduo(Long id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public void buscarCategoriasResiduo() {
        new CategoriaResiduoDAO().buscarTodasCategorias();
    }
}
