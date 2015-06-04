/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.it250.dz.pages;

import com.mycompany.it250.dz.dao.RezervacijeDao;
import com.mycompany.it250.dz.dao.SobaDao;
import com.mycompany.it250.dz.entities.Rezervacija;
import com.mycompany.it250.dz.entities.Sobe;
import java.util.ArrayList;
import java.util.List;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;

/**
 *
 * @author pc
 */
public class DodajRezervaciju {
     @Inject
    private RezervacijeDao rezervacijaDao;

    @Inject
    private SobaDao sobeDao;
    
    
    @Property
    private Rezervacija rezervacija;
    
    @Property
    private List<Rezervacija> rezervacijeLista;

    @Property
    private List<Sobe> sobeLista;

    @Property
    private Sobe soba;
    @Property
    private Rezervacija rezervacijaOne;
    
    public String getSobaIme() {
       if( rezervacijaOne.getSobaId()!=null){
           return rezervacijaOne.getSobaId().getIme();
       }
       else {
           return "nema ime";
       }
        
    }
    
    void onActivate() {
        
        if (rezervacijeLista == null) {
 rezervacijeLista = new ArrayList<Rezervacija>();
 }
        sobeLista=sobeDao.getListaSvih();
        rezervacijeLista = rezervacijaDao.getListaRezervacija();
        
    }
    Object onSuccess() {
        rezervacija.setSobaId(soba);
        rezervacijaDao.dodajRezervaciju(rezervacija);
         return this;
        
    }
    
    Object onActionFromDelete(Integer rezId)
 {
      rezervacijaDao.obrisiRezervaciju(rezId);
         return this;
         
 }
}

