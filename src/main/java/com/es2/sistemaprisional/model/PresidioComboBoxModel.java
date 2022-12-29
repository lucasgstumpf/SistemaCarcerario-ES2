/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.es2.sistemaprisional.model;

import com.es2.sistemaprisional.model.Presidio;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author ranoc
 */
public class PresidioComboBoxModel extends AbstractListModel<Object> implements ComboBoxModel<Object>{
    private List<Presidio> listPresidios;
    private Presidio selectedPresidio;
    private final static int FIRSTINDEX = 0;
 
    public PresidioComboBoxModel() {
        this.listPresidios = new ArrayList<Presidio>();
    }
     
    public PresidioComboBoxModel(List<Presidio> listPresidios) {
        this();
        this.listPresidios.addAll(listPresidios);
        if (getSize() > 0) {
            setSelectedItem(this.listPresidios.get(FIRSTINDEX));
        }
    }
     
    @Override
    public Presidio getElementAt(int index) {
        return listPresidios.get(index);
    }
 
    @Override
    public int getSize() {
        return listPresidios.size();
    }
 
    @Override
    public Presidio getSelectedItem() {
        return selectedPresidio;
    }
 
    @Override
    public void setSelectedItem(Object anItem) {
        selectedPresidio = (Presidio) anItem;
    }
     
    public void addPresidio(Presidio presidio) {
        listPresidios.add(presidio);
        fireIntervalAdded(this, getSize() - 1, getSize() - 1);
        setSelectedItem(listPresidios.get(getSize() - 1));
    }
     
    public void addListPresidio(List<Presidio> presidios) {
        int primeiraLinha = getSize();
        listPresidios.addAll(presidios);
        fireIntervalAdded(this, primeiraLinha, primeiraLinha  + presidios.size());
        setSelectedItem(listPresidios.get(getSize() - 1));
    }
     
    public void removePresidio() {
        listPresidios.remove(getSelectedItem());
        fireIntervalRemoved(this, FIRSTINDEX, getSize() - 1);
        setSelectedItem(listPresidios.get(FIRSTINDEX));
    }
     
    public void clear() {
        listPresidios.clear();
        fireContentsChanged(this, FIRSTINDEX, getSize() - 1);
    }


}
