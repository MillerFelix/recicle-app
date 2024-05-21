package com.usjt.recicle.app.controller;

import com.usjt.recicle.app.model.CategoriaResiduo;
import java.util.ArrayList;
import java.util.List;

public class CategoriaResiduoController {

    public List<CategoriaResiduo> buscarCategoriaResiduos() {
        List<CategoriaResiduo> listaCategorias = new ArrayList<>();
        CategoriaResiduo categoriaResiduo = new CategoriaResiduo();
        listaCategorias = categoriaResiduo.buscarTodasCategorias();
            return listaCategorias;
    }
}