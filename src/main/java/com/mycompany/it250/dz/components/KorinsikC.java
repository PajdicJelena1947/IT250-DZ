/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.it250.dz.components;

import com.mycompany.it250.dz.entities.Korisnik;
import org.apache.tapestry5.annotations.Parameter;

/**
 *
 * @author pc
 */
public class KorinsikC {
    @Parameter
    Korisnik korisnik;
    
    public String getIme(){
        return korisnik.getIme()+"";
        
    }
    public String getPrezime(){
        return korisnik.getPrezime()+"";
        
    }
    public String getJmbf(){
        return korisnik.getPrezime()+"";
        
        
    }
}
