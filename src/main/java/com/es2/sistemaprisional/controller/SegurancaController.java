/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.es2.sistemaprisional.controller;

import com.es2.sistemaprisional.model.FuncionarioCargos;
import com.es2.sistemaprisional.model.Seguranca;

/**
 *
 * @author ranoc
 */
public class SegurancaController {
    private Seguranca user;
    
    
    public SegurancaController(int id){
        user = (Seguranca) PresidioController.
                getFuncionarios().stream().
                filter(
                        func -> 
                                func.getId() == id && 
                                func.getCargo().equals(FuncionarioCargos.SEGURANCA)
                ).findFirst().orElse(null);
    }
    
    public boolean abrirCela(int id_cela){
        var celaCtrl = new CelaController();
        var cela = celaCtrl.getCela(id_cela);
        cela.setAberto(true);
        return cela.isAberto();
    }

    boolean fecharCela(int id_cela) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
