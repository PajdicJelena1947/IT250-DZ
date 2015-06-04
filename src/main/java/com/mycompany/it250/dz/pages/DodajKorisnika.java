/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.it250.dz.pages;

import com.mycompany.it250.dz.dao.KorisnikDao;
import com.mycompany.it250.dz.entities.Korisnik;
import com.mycompany.it250.dz.services.ProtectedPage;
import java.util.ArrayList;
import javax.annotation.security.RolesAllowed;

import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;

/**
 *
 * @author pc
 */
@ProtectedPage
@RolesAllowed(value={"Administrator"})
public class DodajKorisnika {
    
    @Property
    private Korisnik korisnik;
    @Property
    private Korisnik onekorisnik;
    @Property
    private ArrayList<Korisnik> korisnici;
    @Inject
    private KorisnikDao korisnikDao;
    
 void onActivate() {
 if (korisnici == null) {
 korisnici = new ArrayList<Korisnik>();
 }
 korisnici = korisnikDao.getListaSvihKorisnika();
 }
 
  Object onSuccess() {
        korisnikDao.dodajKorisnika(korisnik);
        return this;
    }

Object onActionFromDelete(Integer korisnikId)
 {
korisnikDao.obrisiKorisnika(korisnikId);
    
    return this;
    
    
}

}
