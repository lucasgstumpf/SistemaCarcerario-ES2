/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.es2.sistemaprisional.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author ranoc
 */
public class Presidiario {
    private String cpf;
    private String dataNascimento;
    private GregorianCalendar ultimoDiaDePena;
    private int idCela;
    private ArrayList<Atividade> atividades;
    private String setor;
    private String nome;
    private int id_presidio;

    public Presidiario() {
    }
    
    public Presidiario(String cpf, String dataNascimento, GregorianCalendar ultimoDiaDePena, int idCela, ArrayList<Atividade> atividades, String setor, String nome, int id_presidio) {
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.ultimoDiaDePena = ultimoDiaDePena;
        this.idCela = idCela;
        this.atividades = atividades;
        this.setor = setor;
        this.nome = nome;
        this.id_presidio = id_presidio;
    }

    @Override
    public String toString() {
        /*TODO: Relatório aqui*/
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    public Date fazerServicoComunitario(){
        return null;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public GregorianCalendar getUltimoDiaDePena() {
        return ultimoDiaDePena;
    }

    public void setUltimoDiaDePena(GregorianCalendar ultimoDiaDePena) {
        this.ultimoDiaDePena = ultimoDiaDePena;
    }

    public int getIdCela() {
        return idCela;
    }

    public void setIdCela(int idCela) {
        this.idCela = idCela;
    }

    public ArrayList<Atividade> getAtividades() {
        return atividades;
    }

    public void setAtividades(ArrayList<Atividade> atividades) {
        this.atividades = atividades;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdPresidio() {
        return id_presidio;
    }

    public void setIdPresidio(int idPresidio) {
        this.id_presidio = idPresidio;
    }    
}