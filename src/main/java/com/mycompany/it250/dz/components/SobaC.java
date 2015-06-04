/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.it250.dz.components;

import com.mycompany.it250.dz.entities.Rezervacija;
import org.apache.tapestry5.annotations.Parameter;

/**
 *
 * @author pc
 */
public class SobaC {
     @Parameter
    Rezervacija rezervacija;
        
    public String getIme(){
        return rezervacija.getIme() + " " + rezervacija.getPrezime();
    }
    
    public String getSoba(){
        return rezervacija.getSobaId().getIme() + "(" + rezervacija.getBrojDana() +  " dana)"+"("+rezervacija.getDatum()+"datum)";
    }
    
    
}
