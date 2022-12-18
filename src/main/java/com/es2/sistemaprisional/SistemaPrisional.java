/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.es2.sistemaprisional;
import com.es2.sistemaprisional.model.Atividade;
import com.es2.sistemaprisional.model.Cela;
import com.es2.sistemaprisional.model.Diretor;
import com.es2.sistemaprisional.model.Funcionario;
import com.es2.sistemaprisional.model.FuncionarioCargos;
import com.es2.sistemaprisional.model.Presidiario;
import com.es2.sistemaprisional.model.Presidio;
import com.es2.sistemaprisional.model.Seguranca;
import com.es2.sistemaprisional.model.file_system.FileManager;
import com.es2.sistemaprisional.model.view.DiretorView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.TimeZone;


/**
 *
 * @author ranoc
 */
public class SistemaPrisional {
    
    public static void main(String[] args) throws IOException {
        
        var func1 = new Funcionario(0,
                "nome",
                "123456789",
                "nome@email.com", 
                FuncionarioCargos.FUNCIONARIO, 
                true, 
                true, 
                "presidio");
        var func2 = new Seguranca(1,
                "nome 1",
                "123456789",
                "nome1@email.com", 
                FuncionarioCargos.SEGURANCA, 
                true, 
                true, 
                "presidio",
                "setor 1");
        var func3 = new Diretor(2,
                "nome 2",
                "123456789",
                "nome2@email.com", 
                FuncionarioCargos.DIRETOR, 
                true, 
                true, 
                "presidio");
        var funcs = new ArrayList<Funcionario>();
        funcs.add(func1); funcs.add(func2); funcs.add(func3);
        
        var atv1 = new Atividade(null,
                0,
                "atividade",
                30,
                true,
                func1);
        var atv2 = new Atividade(null,
                0,
                "atividade1",
                30,
                true,
                func2);
        var ativis = new ArrayList<Atividade>();
        ativis.add(atv1);       ativis.add(atv2);
        
        
        var preso1 = new Presidiario("12345678",
                "10/10/2010", 
                new GregorianCalendar(2021,10,10, 15, 10),
                0, 
                ativis, 
                "setor 1", 
                "Lucas Voltera",
                0);
        var preso2 = new Presidiario("12345678",
                "10/10/2010", 
                new GregorianCalendar(2021,10,10, 15, 10),
                0, 
                ativis, 
                "setor 1", 
                "Rafael Correia",
                0);
        var preso3 = new Presidiario("12345678",
                "10/10/2010", 
                new GregorianCalendar(2021,10,10, 15, 10),
                0, 
                ativis, 
                "setor 1", 
                "Guilherme Batalhoti",
                0);
        
        var presos = new ArrayList<Presidiario>();
        presos.add(preso1);
        presos.add(preso2);
        presos.add(preso3);
               
        
        var cela1 = new Cela(true,
                true, 
                preso1, 
                0, 
                "setor1");
        var cela2 = new Cela(true,
                true, 
                preso2, 
                0, 
                "setor1");
        var cela3 = new Cela(true,
                true, 
                preso3, 
                0, 
                "setor1");
        var celas = new ArrayList<Cela>();
        celas.add(cela1);
        celas.add(cela2);
        celas.add(cela3);
        
        var presidio = new Presidio(0, funcs, celas, presos, new GregorianCalendar(TimeZone.getTimeZone("GMT+5:30")));
        
        FileManager.armazenaPresidio(presidio);
        
        
        presidio = (Presidio) FileManager.recuperaPresidio();
        DiretorView.main(presidio);
        
        System.out.println( presidio.getPresidiarios().stream().filter(func -> func.getIdCela() == 0).findFirst().orElse(null));
    }
}
