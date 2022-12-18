/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.es2.sistemaprisional.model;

/**
 *
 * @author ranoc
 */
public class Funcionario {
    private int id;
    private String nome;
    private String cpf;
    private String email;
    private String cargo;
    private boolean aposentado;
    private boolean emFerias;
    private String nomePresidio;

    public Funcionario() {
    }

    public Funcionario(int id, String nome, String cpf, String email, String cargo, boolean aposentado, boolean emFerias, String nomePresidio) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.cargo = cargo;
        this.aposentado = aposentado;
        this.emFerias = emFerias;
        this.nomePresidio = nomePresidio;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public boolean isAposentado() {
        return aposentado;
    }

    public void setAposentado(boolean aposentado) {
        this.aposentado = aposentado;
    }

    public boolean isEmFerias() {
        return emFerias;
    }

    public void setEmFerias(boolean emFerias) {
        this.emFerias = emFerias;
    }

    public String getNomePresidio() {
        return nomePresidio;
    }

    public void setNomePresidio(String nomePresidio) {
        this.nomePresidio = nomePresidio;
    }
    
}
