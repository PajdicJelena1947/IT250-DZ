/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.it250.dz.pages;

import com.mycompany.it250.dz.entities.Korisnik;
import java.util.ArrayList;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.hibernate.Session;

/**
 *
 * @author pc
 */
public class DodajKorisnikaE {
    @Property
private Korisnik korisnik;
@Inject
private Session session;
@Property
private ArrayList<Korisnik> korisnici;
void onActivate() {
if (korisnici == null) {
korisnici = new ArrayList<Korisnik>();
}
korisnici = (ArrayList<Korisnik>) session.createCriteria(Korisnik.class).list();
}

Object onSuccess() {
session.persist(korisnik);
return this;
}

}
