/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.es2.sistemaprisional.model;

/**
 *
 * @author ranoc
 */
public class Diretor extends Funcionario{

    public Diretor() {
    }

    public Diretor(int id, String nome, String cpf, String email, String cargo, boolean aposentado, boolean emFerias,int idPresidio) {
        super(id, nome, cpf, email, cargo, aposentado, emFerias, idPresidio);
    }
    
    
    
}
