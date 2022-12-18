/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.es2.sistemaprisional.controller;

import com.es2.sistemaprisional.model.Presidiario;

/**
 *
 * @author ranoc
 */
public class PresidiarioController {
    private Presidiario presidiario;

    PresidiarioController(String presidiario_cpf) {
        presidiario = (Presidiario) PresidioController.
                getPresidiarios().stream().
                filter(
                        preso -> 
                                preso.getCpf().equals( presidiario_cpf)
                ).findFirst().orElse(null);
    }
    
    public Presidiario getPresidiario(){
        return presidiario;
    }
    
    
    public Presidiario getPresidiarioById(String presidiario_cpf){
        return (Presidiario) PresidioController.
                getPresidiarios().stream().
                filter(
                    pres -> pres.getCpf().equals(presidiario_cpf)
                ).findFirst().orElse(null);
    }
    
    

    void alojarPresidiario(Presidiario presidiario, int id_cela) {
        var celaCtrl = new CelaController();
        celaCtrl.getCela(id_cela).setPresidiario(presidiario);
    }
}
