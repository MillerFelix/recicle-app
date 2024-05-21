package com.usjt.recicle.app.controller;

import com.usjt.recicle.app.model.Residuo;
import java.util.ArrayList;
import java.util.List;

public class ResiduoController {

    public List<Residuo> buscarResiduos() {
        List<Residuo> listaResiduo = new ArrayList<>();
        Residuo residuo = new Residuo();
        listaResiduo = residuo.buscarResiduos();
            return listaResiduo;
    }
}