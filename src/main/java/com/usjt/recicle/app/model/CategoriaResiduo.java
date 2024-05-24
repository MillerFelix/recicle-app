package com.usjt.recicle.app.model;

import com.usjt.recicle.app.dao.CategoriaResiduoDAO;
import java.util.List;

public class CategoriaResiduo {

    private Long id;
    private String nome;
    private String informacao01;
    private String informacao02;

    public CategoriaResiduo() {
    }

    public CategoriaResiduo(Long id, String nome, String informacao01, String informacao02) {
        this.id = id;
        this.nome = nome;
        this.informacao01 = informacao01;
        this.informacao02 = informacao02;
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

    public String getInformacao01() {
        return informacao01;
    }

    public void setInformacao01(String informacao01) {
        this.informacao01 = informacao01;
    }

    public String getInformacao02() {
        return informacao02;
    }

    public void setInformacao02(String informacao02) {
        this.informacao02 = informacao02;
    }

    public List<CategoriaResiduo> buscarTodasCategoriasResiduo() {
        List<CategoriaResiduo> listaCategorias = new CategoriaResiduoDAO().buscarTodasCategoriasResiduo();
        return listaCategorias;
    }
    
    public CategoriaResiduo buscarResiduosPorId(Long id) {
        CategoriaResiduo categoriaResiduo = new CategoriaResiduoDAO().buscarResiduosPorId(id);
        return categoriaResiduo;
    }
}
