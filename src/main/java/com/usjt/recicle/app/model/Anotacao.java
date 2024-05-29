package com.usjt.recicle.app.model;

import com.usjt.recicle.app.dao.AnotacaoDAO;
import java.util.List;

public class Anotacao {

    private Long id;
    private String descricao;
    private Long idCategoriaResiduo;

    public Anotacao() {
    }

    public Anotacao(String descricao) {
        this.descricao = descricao;
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

    public List<Anotacao> buscarAnotacoesCategoriaResiduo(Long id) {
        List<Anotacao> listaAnotacoes = new AnotacaoDAO().buscarAnotacoesCategoriaResiduo(id);
        return listaAnotacoes;
    }

    public void salvar(Anotacao anotacao) {
        new AnotacaoDAO().salvar(anotacao);
    }

    public void editar(Anotacao anotacao) {
        new AnotacaoDAO().editar(anotacao);
    }

    public void excluir(Anotacao anotacao) {
        new AnotacaoDAO().salvar(anotacao);
    }
}
