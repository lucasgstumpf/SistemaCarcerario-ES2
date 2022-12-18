/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.es2.sistemaprisional.model;

import java.util.Date;

/**
 *
 * @author ranoc
 */
public class Relatorio {
    private String nomePresidiario;
    private Date ultimoDiaDePena;
    private Presidiario presidiario;
    private Funcionario funcionario;

    public Relatorio() {
    }
    
    public Relatorio(String nomePresidiario, Date ultimoDiaDePena, Presidiario presidiario, Funcionario funcionario) {
        this.nomePresidiario = nomePresidiario;
        this.ultimoDiaDePena = ultimoDiaDePena;
        this.presidiario = presidiario;
        this.funcionario = funcionario;
    }

    public String getNomePresidiario() {
        return nomePresidiario;
    }

    public void setNomePresidiario(String nomePresidiario) {
        this.nomePresidiario = nomePresidiario;
    }

    public Date getUltimoDiaDePena() {
        return ultimoDiaDePena;
    }

    public void setUltimoDiaDePena(Date ultimoDiaDePena) {
        this.ultimoDiaDePena = ultimoDiaDePena;
    }

    public Presidiario getPresidiario() {
        return presidiario;
    }

    public void setPresidiario(Presidiario presidiario) {
        this.presidiario = presidiario;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    
}








































