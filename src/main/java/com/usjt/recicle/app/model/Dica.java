package com.usjt.recicle.app.model;

import com.usjt.recicle.app.dao.DicaDAO;
import java.util.List;

public class Dica {

    private Long id;
    private String titulo;
    private String descricao;
    private Long idCategoriaResiduo;

    public Dica() {
    }

    public Dica(Long id, String titulo, String descricao, Long idCategoriaResiduo) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.idCategoriaResiduo = idCategoriaResiduo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getIdCategoriaResiduo() {
        return idCategoriaResiduo;
    }

    public void setIdCategoriaResiduo(Long idCategoriaResiduo) {
        this.idCategoriaResiduo = idCategoriaResiduo;
    }
    
    public List<Dica> buscarTodasDicas() {
        List<Dica> listaDicas = new DicaDAO().buscarTodasDicas();
        return listaDicas;
    }
    
    public Dica buscarDicasCategoriaResiduo(Long id) {
        Dica dica = new DicaDAO().buscarDicasCategoriaResiduo(id);
        return dica;
    }
}
