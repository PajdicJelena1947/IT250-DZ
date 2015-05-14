/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.it250.dz.dao;

import com.mycompany.it250.dz.entities.Korisnik;
import java.util.ArrayList;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author pc
 */
public class KorisnikDaoImpl implements KorisnikDao {
    
    @Inject
    private Session session;

    @Override
    public ArrayList<Korisnik> getListaSvihKorisnika() {
        
        return (ArrayList<Korisnik>) session.createCriteria(Korisnik.class).list();
       
    }

    @Override
    public Korisnik getKorisnikById(Integer korisnikId) {
        return (Korisnik) session.createCriteria(Korisnik.class).add(Restrictions.eq("id",korisnikId)).uniqueResult();
      
    }

    @Override
    public void dodajKorisnika(Korisnik korisnik) {
        session.persist(korisnik);
    }

    @Override
    public void obrisiKorisnika(Integer korisnikId) {
        Korisnik korisnik=(Korisnik)
 session.createCriteria(Korisnik.class).add(Restrictions.eq("id",korisnikId)).uniqueResult();
 session.delete(korisnik);
        
    }
    
    
    
}
