package com.usjt.recicle.app.controller;

import com.usjt.recicle.app.model.CategoriaResiduo;
import java.util.ArrayList;
import java.util.List;

public class CategoriaResiduoController {

    public List<CategoriaResiduo> buscarTodasCategorias() {;
        List<CategoriaResiduo> listaCategorias = new ArrayList<>();
        CategoriaResiduo categoriaResiduo = new CategoriaResiduo();
        listaCategorias = categoriaResiduo.buscarTodasCategoriasResiduo();
        return listaCategorias;
    }

    public CategoriaResiduo buscarResiduosPorId(Long id) {
        CategoriaResiduo categoriaResiduo = new CategoriaResiduo();
        categoriaResiduo = categoriaResiduo.buscarResiduosPorId(id);
        return categoriaResiduo;
    }
}
