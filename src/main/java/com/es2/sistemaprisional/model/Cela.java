/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.es2.sistemaprisional.model;

/**
 *
 * @author ranoc
 */
public class Cela {
    private boolean ocupado;
    private boolean aberto;
    private Presidiario presidiario;
    private int idCela;
    private String setor;

    public Cela() {
    }

       
    public Cela(boolean ocupado, boolean aberto, Presidiario presidiario, int idCela, String setor) {
        this.ocupado = ocupado;
        this.aberto = aberto;
        this.presidiario = presidiario;
        this.idCela = idCela;
        this.setor = setor;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Presidiario getPresidiario() {
        return presidiario;
    }

    public void setPresidiario(Presidiario presidiario) {
        this.presidiario = presidiario;
    }

    public int getIdCela() {
        return idCela;
    }

    public void setIdCela(int idCela) {
        this.idCela = idCela;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
        
}



























