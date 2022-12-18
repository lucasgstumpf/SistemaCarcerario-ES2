/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.es2.sistemaprisional.model.file_system;

import com.es2.sistemaprisional.model.Presidio;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author ranoc
 */
public class FileManager {
    private static final String FILE_NAME = "presidio";
    
    public static void armazenaPresidio(Presidio presidio) throws IOException{
        try {
            FileOutputStream fos = new FileOutputStream(new File(FILE_NAME+".xml"));
            try (XMLEncoder encoder = new XMLEncoder(fos)) {
                encoder.writeObject(presidio);
            }
        } catch (IOException e) {
            throw e; 
        }
    }
    
    public static Presidio recuperaPresidio() throws IOException{
        try {
            FileInputStream fis = new FileInputStream(FILE_NAME+".xml");
            Presidio presidio;
            try (XMLDecoder decoder = new XMLDecoder(fis)) {
                presidio = (Presidio) decoder.readObject();
            }
            return presidio;
        } catch (IOException e) {
            throw e;
        }
    }
}
