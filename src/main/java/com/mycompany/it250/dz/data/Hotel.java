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
public class Hotel {
   private String naziv;
   private String grad;
   private String adresa;
   
   
   @Inject
   public Hotel(){
       
   }

   public Hotel(String naziv,String grad,String adresa){
       this.naziv=naziv;
       this.grad=grad;
       this.adresa=adresa;
   }
    /**
     * @return the naziv
     */
    public String getNaziv() {
        return naziv;
    }

    /**
     * @param naziv the naziv to set
     */
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    /**
     * @return the grad
     */
    public String getGrad() {
        return grad;
    }

    /**
     * @param grad the grad to set
     */
    public void setGrad(String grad) {
        this.grad = grad;
    }

    /**
     * @return the adresa
     */
    public String getAdresa() {
        return adresa;
    }

    /**
     * @param adresa the adresa to set
     */
    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
   
}
