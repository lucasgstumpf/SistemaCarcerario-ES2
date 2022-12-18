/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.es2.sistemaprisional.model;

/**
 *
 * @author ranoc
 */
public class FuncionarioCargos {
    public final static String SEGURANCA = "seguranca";
    public final static String DIRETOR = "diretor";
    public final static String FUNCIONARIO = "funcionario";
    
    public static boolean isValidCargo(String cargo){
        switch (cargo) {
            case SEGURANCA -> {
            }
            case DIRETOR -> {
            }
            case FUNCIONARIO -> {
            }
            default -> {
                return false;
            }
        }
        return true;
    }
}
