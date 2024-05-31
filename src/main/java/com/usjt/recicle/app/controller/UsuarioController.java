package com.usjt.recicle.app.controller;

import com.usjt.recicle.app.model.Usuario;

public class UsuarioController {

    public boolean cadastrarUsuario(String nome, String email, String senha) {
        if (nome != null && nome.length() > 0 && email != null && email.length() > 0 && senha != null && senha.length() > 0) {
            Usuario usuario = new Usuario(null, nome, email, senha);
            if (usuario.verificarEmail(email)) {
                System.out.println("Email já existe no banco de dados");
                return false;
            } else {
                System.out.println("Email válido");
                usuario.cadastrarUsuario(usuario);
                return true;
            }
        }
        return false;
    }

    public boolean validarCredenciais(String email, String senha) {
        Usuario usuario = new Usuario();
        return usuario.validarCredenciais(email, senha);
    }
}
