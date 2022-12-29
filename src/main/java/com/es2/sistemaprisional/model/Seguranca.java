/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.es2.sistemaprisional.model;

/**
 *
 * @author ranoc
 */
public class Seguranca extends Funcionario{
    private String setor;
    public Seguranca() {
        super(0, null, null, null, null, false, false, -1);
    }  
    
    public Seguranca(int id, String nome, String cpf, String email, String cargo, boolean aposentado, boolean emFerias, int idPresidio, String setor) {
        super(id, nome, cpf, email, cargo, aposentado, emFerias, idPresidio);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    
}
