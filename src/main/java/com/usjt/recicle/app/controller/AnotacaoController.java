package com.usjt.recicle.app.controller;

import com.usjt.recicle.app.model.Anotacao;
import java.util.ArrayList;
import java.util.List;

public class AnotacaoController {

    public boolean salvar(String novaAnotacao, Long idCategoriaResiduo, Long idUsuario) {
        if (novaAnotacao != null) {
            Anotacao anotacao = new Anotacao();
            anotacao.setDescricao(novaAnotacao);
            anotacao.setIdCategoriaResiduo(idCategoriaResiduo);
            anotacao.setIdUsuario(idUsuario);
            anotacao.salvar(anotacao);
            return true;
        }
        return false;
    }

    public List<Anotacao> buscarAnotacoesCategoriaResiduo(Long idCategoriaResiduo, Long idUsuario) {
        List<Anotacao> listaAnotacoes = new ArrayList<>();
        Anotacao anotacao = new Anotacao();
        listaAnotacoes = anotacao.buscarAnotacoesCategoriaResiduo(idCategoriaResiduo, idUsuario);
        return listaAnotacoes;
    }

    public boolean editar(Anotacao novaAnotacao) {
        if (novaAnotacao.getId() != null && novaAnotacao.getDescricao() != null) {
            Anotacao anotacao = new Anotacao(novaAnotacao.getDescricao());
            anotacao.editar(novaAnotacao);
            return true;
        }
        return false;
    }

    public boolean excluir(Anotacao anotacaoExcluida) {
        if (anotacaoExcluida != null) {
            Anotacao anotacao = new Anotacao(anotacaoExcluida.getDescricao());
            anotacao.excluir(anotacaoExcluida);
            return true;
        }
        return false;
    }
}
