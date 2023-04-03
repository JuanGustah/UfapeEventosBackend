package com.ufape.eventos.negocio.basica;

import java.util.List;
import java.util.ArrayList;

public abstract class Usuario {
    private long id;
    private String nome;
    private String login;
    private String senha;
    private List<Ingresso> ingressos; //Nova lista de ingressos
    
    public Usuario() {
        ingressos = new ArrayList<Ingresso>(); //Inicialização da lista de ingressos
    }
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    //Getters e setters da lista de ingressos
    public List<Ingresso> getIngressos() {
        return ingressos;
    }
    public void setIngressos(List<Ingresso> ingressos) {
        this.ingressos = ingressos;
    }
    
    //Método para adicionar um ingresso à lista de ingressos
    public void adicionarIngresso(Ingresso ingresso) {
        this.ingressos.add(ingresso);
    }
}

