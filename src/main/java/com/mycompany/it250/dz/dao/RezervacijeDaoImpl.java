/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.it250.dz.dao;

import com.mycompany.it250.dz.entities.Rezervacija;
import java.util.List;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author pc
 */
public class RezervacijeDaoImpl implements RezervacijeDao{
    
    @Inject
    private Session session;

    @Override
    public List<Rezervacija> getListaRezervacija() {
        return session.createCriteria(Rezervacija.class).list();
    }

    @Override
    public Rezervacija getRezervacijaById(Integer rezId) {
        return (Rezervacija) session.createCriteria(Rezervacija.class).add(Restrictions.eq("id", rezId)).uniqueResult();
    }

    @Override
    public void dodajRezervaciju(Rezervacija soba) {
        session.persist(soba);
    }

    @Override
    public void obrisiRezervaciju(int rezId) {
        Rezervacija rez = (Rezervacija) session.createCriteria(Rezervacija.class).add(Restrictions.eq("id", rezId)).uniqueResult();
        session.delete(rez);
    }

}
