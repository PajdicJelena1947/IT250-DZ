/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.it250.dz.dao;

import com.mycompany.it250.dz.entities.Rezervacija;
import java.util.List;

/**
 *
 * @author pc
 */
public interface RezervacijeDao {
    public List<Rezervacija> getListaRezervacija();

    public Rezervacija getRezervacijaById(Integer rezId);

    public void dodajRezervaciju(Rezervacija soba);

    public void obrisiRezervaciju(int rezId);
}
