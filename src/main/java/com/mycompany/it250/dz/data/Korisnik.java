/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.it250.dz.data;

import org.apache.tapestry5.ioc.annotations.Inject;

/**
 *
 * @author pc
 */
public class Korisnik {
    
    private String ime;
    private String prezime;
    private String jmbg;
    
    @Inject
    public Korisnik(){
        
         
    }
    public Korisnik(String ime,String prezime,String jmbg){
        this.ime=ime;
        this.prezime=prezime;
        this.jmbg=jmbg;
    }

    
   

    /**
     * @return the ime
     */
    public String getIme() {
        return ime;
    }

    /**
     * @param ime the ime to set
     */
    public void setIme(String ime) {
        this.ime = ime;
    }

    /**
     * @return the prezime
     */
    public String getPrezime() {
        return prezime;
    }

    /**
     * @param prezime the prezime to set
     */
    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    /**
     * @return the jmbg
     */
    public String getJmbg() {
        return jmbg;
    }

    /**
     * @param jmbg the jmbg to set
     */
    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }
}
