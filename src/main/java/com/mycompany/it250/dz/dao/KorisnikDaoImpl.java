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
import org.hibernate.criterion.Projections;
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
        return (Korisnik) session.createCriteria(Korisnik.class).add(Restrictions.eq("id", korisnikId)).uniqueResult();

    }

    @Override
    public void dodajKorisnika(Korisnik korisnik) {
        session.persist(korisnik);
    }

    @Override
    public void obrisiKorisnika(Integer korisnikId) {
        Korisnik korisnik = (Korisnik) session.createCriteria(Korisnik.class).add(Restrictions.eq("id", korisnikId)).uniqueResult();
        session.delete(korisnik);

    }

    @Override
    public Korisnik check(String email, String password) {
        try {
            Korisnik kor = (Korisnik) session.createCriteria(Korisnik.class).add(Restrictions.eq("email",
                    email)).add(Restrictions.eq("password", password)).uniqueResult();
            if (kor != null) {
                return kor;
            }
            return null;
        } catch (NullPointerException e) {
            return null;
        }
    }

    @Override
    public Korisnik register(Korisnik korisnik) {
        return (Korisnik) session.merge(korisnik);

    }

    @Override
    public boolean proveriemail(String email) {
        Long rows = (Long) session.createCriteria(Korisnik.class).add(Restrictions.eq("email",
                email)).setProjection(Projections.rowCount()).uniqueResult();
        return (rows == 0) ? false : true;
    }

    @Override
    public boolean korisnikPostoji(String user) {
        long rows = (Long) session.createCriteria(Korisnik.class).add(Restrictions.eq("username",
                user)).setProjection(Projections.rowCount()).uniqueResult();
        return (rows != 0);
    }

}
