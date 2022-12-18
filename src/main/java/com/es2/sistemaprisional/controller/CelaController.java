/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.es2.sistemaprisional.controller;

import com.es2.sistemaprisional.model.Cela;

/**
 *
 * @author ranoc
 */
public class CelaController {

    public boolean abrirCela(Cela cela) {
        cela.setAberto(true);
        return true;
    }

    public Cela getCela(int id_cela) {
        return (Cela) PresidioController.getCelas().stream().filter(cela -> cela.getIdCela() == id_cela).findFirst().orElse(null);
    }
    
}
