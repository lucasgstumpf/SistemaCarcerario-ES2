/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.es2.sistemaprisional.controller;

import com.es2.sistemaprisional.model.Presidio;
import java.util.ArrayList;

/**
 *
 * @author ranoc
 */
public class PresidiosController {
    private static ArrayList<Presidio>  presidios;

    public PresidiosController(Presidio presidio) {
        presidios = new ArrayList<>();
        presidios.add(presidio);
    }

    public static ArrayList<Presidio> getPresidios() {
        return presidios;
    }
    
    
    
    public static Presidio findPresidioById(int presidio_id){
        return presidios.stream().filter(presidio -> presidio.getId() == presidio_id).findFirst().orElse(null);
    }    
}
