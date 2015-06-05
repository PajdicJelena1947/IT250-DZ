/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.it250.dz.pages;

import com.mycompany.it250.dz.dao.RezervacijeDao;
import com.mycompany.it250.dz.entities.Rezervacija;
import java.util.List;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;

/**
 *
 * @author pc
 */
public class SobaCc {
    @Property
    private Rezervacija rez;
    
    @Inject
    private RezervacijeDao rezervacijaDao;
    
    public List<Rezervacija> getRezervacijeList(){
        return rezervacijaDao.getListaRezervacija();
    }
}
