package com.usjt.recicle.app.model;

import com.usjt.recicle.app.dao.ResiduoDAO;
import java.util.List;

public class Residuo {

    private Long id;
    private String nome;
    private String descricao;
    private Long idCategoriaResiduo;

    public Residuo() {
    }

    public Residuo(Long id, String nome, String descricao, Long categoria) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.idCategoriaResiduo = idCategoriaResiduo;
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

    public Long getIdCategoriaResiduo() {
        return idCategoriaResiduo;
    }

    public void setIdCategoriaResiduo(Long idCategoriaResiduo) {
        this.idCategoriaResiduo = idCategoriaResiduo;
    }
    
        public List<Residuo> buscarTodosResiduos() {
        List<Residuo> listaResiduos = new ResiduoDAO().buscarTodosResiduos();
        return listaResiduos;
    }
}
