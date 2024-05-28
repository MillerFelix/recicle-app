package com.usjt.recicle.app.model;

import com.usjt.recicle.app.dao.UsuarioDAO;

public class Usuario {

    private Long id;
    private String nome;
    private String email;
    private String senha;
    private static Usuario usuarioAtual;

    public Usuario() {
    }

    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public Usuario(Long id, String nome, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public static Usuario getUsuarioAtual() {
        return usuarioAtual;
    }

    public static void setUsuarioAtual(Usuario usuario) {
        usuarioAtual = usuario;
    }

    public static void encerrarSessao() {
        usuarioAtual = null;
    }

    public void cadastrarUsuario(Usuario usuario) {
        new UsuarioDAO().cadastrarUsuario(usuario);
    }

    public boolean validarCredenciais(String email, String senha) {
        Usuario usuario = new UsuarioDAO().validarCredenciais(email, senha);
        if (usuario != null) {
            Usuario.setUsuarioAtual(usuario);
            return true;
        } else {
            return false;
        }
    }
}
