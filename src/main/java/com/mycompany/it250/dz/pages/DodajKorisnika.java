/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.it250.dz.pages;

import com.mycompany.it250.dz.data.Korisnik;
import java.util.ArrayList;
import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;

/**
 *
 * @author pc
 */
public class DodajKorisnika {

    @Persist
    @Property
    private ArrayList<Korisnik> korisnici;
    @Property
    private Korisnik korisnik;

    void onActivate() {
        if (korisnici == null) {
            korisnici = new ArrayList<Korisnik>();
        }
    }

    Object onSuccess() {
        korisnici.add(korisnik);
        return this;
    }

}
