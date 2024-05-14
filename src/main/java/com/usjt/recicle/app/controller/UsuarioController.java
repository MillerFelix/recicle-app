package com.usjt.recicle.app.controller;

import com.usjt.recicle.app.model.Usuario;

public class UsuarioController {

    public boolean cadastrarUsuario(String nome, String email, String senha) {
        if (nome != null && nome.length() > 0 && email != null && email.length() > 0 && senha != null && senha.length() > 0) {
            Usuario usuario = new Usuario(nome, email, senha);
            usuario.cadastrarUsuario(usuario);
            return true;
        }
        return false;
    }
}
