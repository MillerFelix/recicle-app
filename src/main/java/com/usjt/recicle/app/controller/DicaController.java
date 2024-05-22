package com.usjt.recicle.app.controller;

import com.usjt.recicle.app.model.Dica;
import java.util.ArrayList;
import java.util.List;

public class DicaController {

    public List<Dica> bucarTodasDicas() {
        List<Dica> listaDicas = new ArrayList<>();
        Dica dica = new Dica();
        listaDicas = dica.buscarTodasDicas();
        return listaDicas;
    }
}
