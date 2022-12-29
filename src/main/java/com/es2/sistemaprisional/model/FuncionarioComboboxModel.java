/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.es2.sistemaprisional.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author ranoc
 */
public class FuncionarioComboboxModel extends AbstractListModel<Object> implements ComboBoxModel<Object>{
    private List<Funcionario> listFuncionarios;
    private Funcionario selectedFuncionario;
    private final static int FIRSTINDEX = 0;
 
    public FuncionarioComboboxModel() {
        this.listFuncionarios = new ArrayList<Funcionario>();
    }
     
    public FuncionarioComboboxModel(List<Funcionario> listFuncionarios) {
        this();
        this.listFuncionarios.addAll(listFuncionarios);
        if (getSize() > 0) {
            setSelectedItem(this.listFuncionarios.get(FIRSTINDEX));
        }
    }
     
    @Override
    public Funcionario getElementAt(int index) {
        return listFuncionarios.get(index);
    }
 
    @Override
    public int getSize() {
        return listFuncionarios.size();
    }
 
    @Override
    public Funcionario getSelectedItem() {
        return selectedFuncionario;
    }
 
    @Override
    public void setSelectedItem(Object anItem) {
        var tempFunc = (Funcionario) anItem;
        switch (tempFunc.getCargo()) {
            case FuncionarioCargos.DIRETOR -> selectedFuncionario = (Diretor) anItem;
            case FuncionarioCargos.SEGURANCA -> selectedFuncionario = (Seguranca) anItem;
            default -> selectedFuncionario = (Funcionario) anItem;
        }
    }
     
    public void addFuncionario(Funcionario funcionario) {
        listFuncionarios.add(funcionario);
        fireIntervalAdded(this, getSize() - 1, getSize() - 1);
        setSelectedItem(listFuncionarios.get(getSize() - 1));
    }
     
    public void addListFuncionario(List<Funcionario> funcionarios) {
        int primeiraLinha = getSize();
        listFuncionarios.addAll(funcionarios);
        fireIntervalAdded(this, primeiraLinha, primeiraLinha  + funcionarios.size());
        setSelectedItem(listFuncionarios.get(getSize() - 1));
    }
     
    public void removeFuncionario() {
        listFuncionarios.remove(getSelectedItem());
        fireIntervalRemoved(this, FIRSTINDEX, getSize() - 1);
        setSelectedItem(listFuncionarios.get(FIRSTINDEX));
    }
     
    public void clear() {
        listFuncionarios.clear();
        fireContentsChanged(this, FIRSTINDEX, getSize() - 1);
    }


}
