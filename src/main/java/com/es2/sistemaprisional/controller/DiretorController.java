/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.es2.sistemaprisional.controller;

import com.es2.sistemaprisional.model.Cela;
import com.es2.sistemaprisional.model.Diretor;
import com.es2.sistemaprisional.model.Funcionario;
import com.es2.sistemaprisional.model.FuncionarioCargos;
import com.es2.sistemaprisional.model.Presidiario;
import java.util.GregorianCalendar;

/**
 *
 * @author ranoc
 */
public class DiretorController {
    private Diretor diretor;

    public DiretorController(int diretor_id) {
        PresidioController.getFuncionarios().stream().filter(funcs -> funcs.getId()==diretor_id);
    }
    
    public boolean transferirPresidiario(String presidiario_cpf, int id_presidio){
        var presidio = PresidiosController.findPresidioById(id_presidio);
        if(presidio == null){
            return false;
        }
        var presidiarioCtrl = new PresidiarioController(presidiario_cpf);
        var presidiario = presidiarioCtrl.getPresidiario();
        if(presidiario == null){
            return false;
        }
        PresidioController.getPresidiarios().removeIf(preso -> preso.getCpf()== presidiario_cpf);
        presidio.getPresidiarios().add(presidiario);
        return true;
    }
    
    public boolean alterarCargoFuncionario(int func_id, String novo_cargo){
        var funcionarioCtrl = new FuncionarioController(func_id);
        var func = funcionarioCtrl.getFuncionario();
        
        if(!FuncionarioCargos.isValidCargo(novo_cargo)){
            return false;
        }
        func.setCargo(novo_cargo);
        return true;
    }
    
    public boolean aposentarFuncionario(int func_id){
        var funcionarioCtrl = new FuncionarioController(func_id);
        var func = funcionarioCtrl.getFuncionario();
        if(func == null){
            return false;
        }
        func.setAposentado(true);
        return func.isAposentado();
    }
    
    public boolean transferirFuncionario(int func_id, int id_presidio){
        var presidio = PresidiosController.findPresidioById(id_presidio);
        if(presidio == null){
            return false;
        }
        var funcCtrl = new FuncionarioController(func_id);
        var funcionario = funcCtrl.getFuncionario();
        if(funcionario == null){
            return false;
        }
        PresidioController.getFuncionarios().removeIf(func -> func.getId() == func_id);
        presidio.getFuncionarios().add(funcionario);
        return true;
    }
    
    public boolean registrarFeriasFuncionario(int func_id){
        var funcCtrl = new FuncionarioController(func_id);
        var funcionario = funcCtrl.getFuncionario();
        if(funcionario == null){
            return false;
        }
        funcionario.setEmFerias(true);
        return funcionario.isEmFerias();
    }
    
    public Cela cadastrarCela(int id_cela, String setor){
        var new_cela = new Cela(false, true, null, id_cela, setor);
        
        PresidioController.getCelas().add(new_cela);
        var celaCtrl = new CelaController();
        return celaCtrl.getCela(id_cela);
    }
    
    public Funcionario cadastrarFuncionario(
            int id_funcionario, 
            String nome, 
            String cpf, 
            String email, 
            String cargo, 
            int idPresidio){
        var funcCtrl = new FuncionarioController(id_funcionario);
        if(funcCtrl.getFuncionario() != null){
            return null;
        }
        var new_func = new Funcionario(idPresidio, nome, cpf, email, cargo, false, false, nome);
        PresidioController.getFuncionarios().add(new_func);
        funcCtrl = new FuncionarioController(id_funcionario);
        return funcCtrl.getFuncionario();
    }
    
    public Presidiario cadastrarPresidiario(
            String presidiario_cpf,
            String data_nascimento,
            String nome,
            GregorianCalendar ultimoDiaPena,
            String setor,
            int id_presidio){
        var presidiarioCtrl = new PresidiarioController(presidiario_cpf);
        if(presidiarioCtrl.getPresidiario() != null){
            return null;
        }
        var new_presidiario = new Presidiario(
                presidiario_cpf, 
                data_nascimento,
                ultimoDiaPena,
                -1, 
                null, 
                setor, 
                nome, 
                id_presidio);
        PresidioController.getPresidiarios().add(new_presidiario);
        var presidiario = presidiarioCtrl.getPresidiarioById(presidiario_cpf);
        return presidiario;
    }
    
    public void solicitarAlojamentoPresidiario(String presidiario_cpf, String id_presidio, int id_cela) {
        
    }
    
    public void abrirTodasCelas(){
        
    }
    public void fechaTodasCelas(){
        
    }
    
    public void alojarPresidiario(){
        
    }

    void alojarPresidiario(String presidiario_cpf, String id_presidio, int id_cela) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
