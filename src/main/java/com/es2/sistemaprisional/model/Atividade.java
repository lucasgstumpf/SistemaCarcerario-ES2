/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.es2.sistemaprisional.model;

/**
 *
 * @author ranoc
 */
public class Atividade {
    private Presidiario presidiario;
    private int idAtividade;
    private String nomeAtividade;
    private int qtdDiasPenaReduzida;
    private boolean comunitaria;
    private Funcionario funcionario;

    public Atividade() {
    }

    public Atividade(Presidiario presidiario, int idAtividade, String nomeAtividade, int qtdDiasPenaReduzida, boolean comunitaria, Funcionario funcionario) {
        this.presidiario = presidiario;
        this.idAtividade = idAtividade;
        this.nomeAtividade = nomeAtividade;
        this.qtdDiasPenaReduzida = qtdDiasPenaReduzida;
        this.comunitaria = comunitaria;
        this.funcionario = funcionario;
    }

    public Presidiario getPresidiario() {
        return presidiario;
    }

    public void setPresidiario(Presidiario presidiario) {
        this.presidiario = presidiario;
    }

    public int getIdAtividade() {
        return idAtividade;
    }

    public void setIdAtividade(int idAtividade) {
        this.idAtividade = idAtividade;
    }

    public String getNomeAtividade() {
        return nomeAtividade;
    }

    public void setNomeAtividade(String nomeAtividade) {
        this.nomeAtividade = nomeAtividade;
    }

    public int getQtdDiasPenaReduzida() {
        return qtdDiasPenaReduzida;
    }

    public void setQtdDiasPenaReduzida(int qtdDiasPenaReduzida) {
        this.qtdDiasPenaReduzida = qtdDiasPenaReduzida;
    }

    public boolean isComunitaria() {
        return comunitaria;
    }

    public void setComunitaria(boolean comunitaria) {
        this.comunitaria = comunitaria;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    
}



























