/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.it250.dz.pages;

import com.mycompany.it250.dz.dao.KorisnikDao;
import com.mycompany.it250.dz.entities.Korisnik;
import java.util.List;
import org.apache.tapestry5.annotations.InjectComponent;
import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.corelib.components.Zone;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.services.Request;
import org.apache.tapestry5.services.ajax.AjaxResponseRenderer;

/**
 *
 * @author pc
 */
public class AjaxZone {
    @Inject
 private KorisnikDao korisnikDao;
 @Property
 @Persist
 private Korisnik korisnik;
 @Property
 private Korisnik onekorisnik;
 @Property
 private List<Korisnik> kor;
 @InjectComponent
 private Zone zoneKorisnik;
 @InjectComponent
 private Zone formZone;
 @Inject
 private Request request;
 @Inject
 private AjaxResponseRenderer ajaxResponseRenderer;
 void onActivate() {
 kor = korisnikDao.getListaSvihKorisnika();
 }

 Object onSuccess() {
 korisnikDao.dodajKorisnika(korisnik);
 kor = korisnikDao.getListaSvihKorisnika();
 korisnik = new Korisnik();
 if(request.isXHR()){
 ajaxResponseRenderer.addRender(zoneKorisnik).addRender(formZone);
 }
 return request.isXHR() ? zoneKorisnik.getBody() : null;
 }

}
