/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.es2.sistemaprisional.controller;

import com.es2.sistemaprisional.model.Atividade;
import com.es2.sistemaprisional.model.Funcionario;
import com.es2.sistemaprisional.model.Presidiario;
import java.util.ArrayList;

/**
 *
 * @author ranoc
 */
public class FuncionarioController {
    private Funcionario user;
    
    public FuncionarioController(int id_funcionario){
        user = PresidioController.getFuncionarios().stream().filter(func -> func.getId() == id_funcionario ).findFirst().orElse(null);
    }
    
    public Funcionario getFuncionario(){
        return user;
    }
    
    private ArrayList<Presidiario> filtrarPresidiarios(){
        return null;
    }
    
    public Presidiario acessarRegistroPresidiario(Funcionario func, Object args){
        return null;
    }
    
    public void criarAtividade(Funcionario func, Atividade ativ){
          
    }
    
    public void registrarServicoComunitario(){
        
    }

    public String acessarRegistroPresidiario(String presidiario_cpf) {
        var presidiarioCtrl = new PresidiarioController(presidiario_cpf);
        var presidiario = presidiarioCtrl.getPresidiario();
        return presidiario.toString();
    }

    boolean alterarCargoFuncionario(String novo_cargo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
