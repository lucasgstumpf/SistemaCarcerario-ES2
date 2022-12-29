/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.es2.sistemaprisional.model;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 *
 * @author ranoc
 */

public class Presidio {
    private int id;
    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Cela> celas;
    private ArrayList<Presidiario> presidiarios;
    private GregorianCalendar horario; 
    
    public Presidio(){
        
    }

    @Override
    public String toString() {
        return "Presídio "+ id;
    }
    
    

    public Presidio(int id, ArrayList<Funcionario> funcionarios, ArrayList<Cela> celas, ArrayList<Presidiario> presidiarios, GregorianCalendar horario) {
        this.id = id;
        this.funcionarios = funcionarios;
        this.celas = celas;
        this.presidiarios = presidiarios;
        this.horario = horario;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public ArrayList<Cela> getCelas() {
        return celas;
    }

    public void setCelas(ArrayList<Cela> celas) {
        this.celas = celas;
    }

    public ArrayList<Presidiario> getPresidiarios() {
        return presidiarios;
    }

    public void setPresidiarios(ArrayList<Presidiario> presidiarios) {
        this.presidiarios = presidiarios;
    }

    public GregorianCalendar getHorario() {
        return horario;
    }

    public void setHorario(GregorianCalendar horario) {
        this.horario = horario;
    }
    
}














































