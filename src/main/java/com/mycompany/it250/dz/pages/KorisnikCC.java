/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.it250.dz.pages;

import com.mycompany.it250.dz.dao.KorisnikDao;
import com.mycompany.it250.dz.entities.Korisnik;
import java.util.List;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;

/**
 *
 * @author pc
 */
public class KorisnikCC {
    @Property
    Korisnik korisnik;
    
     @Inject
    private KorisnikDao korisnikDao;
    
    public List<Korisnik> getKorisnikList(){
        return korisnikDao.getListaSvihKorisnika();
    }
}
