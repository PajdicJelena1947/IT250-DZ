/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.it250.dz.dao;

import com.mycompany.it250.dz.entities.Korisnik;
import java.util.ArrayList;

/**
 *
 * @author pc
 */
public interface KorisnikDao {
    
    public ArrayList<Korisnik> getListaSvihKorisnika();

    public Korisnik getKorisnikById(Integer korisnikId);

    public void dodajKorisnika(Korisnik korisnik);

    public void obrisiKorisnika(Integer korisnikId);
}
