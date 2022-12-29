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
import com.es2.sistemaprisional.model.Presidio;
import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 *
 * @author ranoc
 */
public class PresidioController {
    private static Presidio presidio;

    public PresidioController(Presidio presidio) throws Exception {
        Diretor diretor = (Diretor) presidio.getFuncionarios().stream().filter(func -> func.getCargo().equals(FuncionarioCargos.DIRETOR)).findFirst().orElse(null);
        if(diretor == null){
            throw new Exception("Sem diretor!");
        }
        PresidioController.presidio = presidio;
    }
        
    public static ArrayList<Funcionario> getFuncionarios(){
        return presidio.getFuncionarios();
    }
    
    public static ArrayList<Presidiario> getPresidiarios(){
        return presidio.getPresidiarios();
    }
    
    public static ArrayList<Cela> getCelas(){
        return presidio.getCelas();
    }
    
    public void abrirTodasCelas(){
        presidio.getCelas().stream().forEach((cela) -> {
           cela.setAberto(true);
        });
    }
    public void fecharTodasCelas(){
        presidio.getCelas().stream().forEach((cela) -> {
           cela.setAberto(false);
        });
    }

    
    /**
    *
    * Diretor user
    */
    
    public boolean solicitarAposentarFuncionario(int diretor_id, int func_id){
        var diretorCtrl = new DiretorController(diretor_id);
        return diretorCtrl.aposentarFuncionario(func_id);
    }
    
    public boolean solicitarAlterarCargoFuncionario(int diretor_id, int func_id, String novo_cargo){
        var diretorCtrl = new DiretorController(diretor_id);
        return diretorCtrl.alterarCargoFuncionario(func_id, novo_cargo);
        
    }
    
    public boolean solicitarTransferirFuncionario(int diretor_id, int func_id, int id_presidio){
        var diretorCtrl = new DiretorController(diretor_id);
        return diretorCtrl.transferirFuncionario(func_id, id_presidio);
    }
    
    public boolean solicitarFeriasFuncionario(int diretor_id, int func_id){
        var diretorCtrl = new DiretorController(diretor_id);
        return diretorCtrl.registrarFeriasFuncionario(func_id);
    }
    
    public boolean solicitarCadastroCela(int diretor_id, int id_cela, String setor){
        var diretorCtrl = new DiretorController(diretor_id);
        var cela = diretorCtrl.cadastrarCela(id_cela, setor);
        return cela != null;
    }
    
    public void solicitarAlojamentoPresidiario(String presidiario_cpf, String id_presidio, int id_cela, int diretor_id){
        var diretorCtrl = new DiretorController(diretor_id);
        diretorCtrl.alojarPresidiario(presidiario_cpf, id_presidio, id_cela);
    }
    
    public Presidiario solicitarCadastroPresidiario(
            String presidiario_cpf,
            String data_nascimento,
            String nome,
            GregorianCalendar ultimoDiaPena,
            String setor,
            int id_presidio,
            int diretor_id){
        var diretorCtrl = new DiretorController(diretor_id);
        return diretorCtrl.cadastrarPresidiario(presidiario_cpf, data_nascimento, nome, ultimoDiaPena, setor, id_presidio);
    }
    
    public Funcionario solicitarCadastroFuncionario(
            int id_funcionario,
            String funcionario_cpf, 
            String nome,
            String email,
            String cargo,
            int id_presidio,
            int diretor_id){
        var diretorCtrl = new DiretorController(diretor_id);
        return diretorCtrl.cadastrarFuncionario(
                id_funcionario,
                nome, 
                funcionario_cpf, 
                email, 
                cargo, 
                id_presidio);
    }
    
    public boolean solicitarTransferirPresidiario(int diretor_id, String presidiario_cpf, int id_presidio){
        var diretorCtrl = new DiretorController(diretor_id);
        return diretorCtrl.transferirPresidiario(presidiario_cpf, id_presidio);
    }
        
    /**
    *
    * Segurança user
    */
    
    public boolean solicitarAbrirCela(int func_id, int id_cela){
        var segurancaCtrl = new SegurancaController(func_id);
        return segurancaCtrl.abrirCela(id_cela);
    }
    
    public boolean solicitarFecharCela(int user_id, int id_cela){
        var segurancaCtrl = new SegurancaController(user_id);
        return segurancaCtrl.fecharCela(id_cela);
    }
    
    
    /**
    *
    * Funcionario user
    */
    
    
    
    public String solicitarAcessoRegistroPresidiario(int func_id, String presidiario_cpf){
        var funcionarioCtrl = new FuncionarioController(func_id);
        return funcionarioCtrl.acessarRegistroPresidiario(presidiario_cpf);
    }
       
    public boolean solicitarCriarAtividade(int func_id, String presidiario_cpf, String nome_atividade, String quantidade_reducao_pena_em_dias){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public boolean solicitarCriarRelatorioPresidiario(int func_id, String presidiario_cpf){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public boolean solicitarRegistroServicoComunitario(int func_id, int quantidade_reducao_pena_em_dias, String presidiario_cpf){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
