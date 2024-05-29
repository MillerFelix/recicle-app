package com.usjt.recicle.app.model;

import com.usjt.recicle.app.dao.AnotacaoDAO;
import java.util.List;

public class Anotacao {

    private Long id;
    private String descricao;
    private Long idCategoriaResiduo;
    private Long idUsuario;

    public Anotacao() {
    }

    public Anotacao(String descricao) {
        this.descricao = descricao;
    }

    public Anotacao(Long id, String descricao, Long idCategoriaResiduo, Long idUsuario) {
        this.id = id;
        this.descricao = descricao;
        this.idCategoriaResiduo = idCategoriaResiduo;
        this.idUsuario = idUsuario;
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

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public List<Anotacao> buscarAnotacoesCategoriaResiduo(Long idCategoriaResiduo, Long idUsuario) {
        List<Anotacao> listaAnotacoes = new AnotacaoDAO().buscarAnotacoesCategoriaResiduo(idCategoriaResiduo, idUsuario);
        return listaAnotacoes;
    }

    public void salvar(Anotacao anotacao) {
        new AnotacaoDAO().salvar(anotacao);
    }

    public void editar(Anotacao anotacao) {
        new AnotacaoDAO().editar(anotacao);
    }

    public void excluir(Anotacao anotacao) {
        new AnotacaoDAO().excluir(anotacao);
    }
}
