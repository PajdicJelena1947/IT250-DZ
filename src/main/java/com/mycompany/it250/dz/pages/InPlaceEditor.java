/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.it250.dz.pages;

import com.mycompany.it250.dz.dao.KorisnikDao;
import com.mycompany.it250.dz.entities.Korisnik;
import java.util.List;
import org.apache.tapestry5.ComponentResources;
import org.apache.tapestry5.annotations.OnEvent;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.services.ajax.AjaxResponseRenderer;

/**
 *
 * @author pc
 */
public class InPlaceEditor {
   @Property
 private Korisnik korisnik;
 @Property
 private List<Korisnik> kor;
 @Inject
 private AjaxResponseRenderer ajaxResponseRenderer;
 @Inject
 private KorisnikDao korisnikDao;
 @Inject
 private ComponentResources _componentResources;
 void onActivate() {
 kor = korisnikDao.getListaSvihKorisnika();
 }
 
 @OnEvent(component = "imeKorisnika", value = InPlaceEditor.SAVE_EVENT)
 void setImeKorisnika(Long id, String value) {
 Korisnik korisnik = (Korisnik) korisnikDao.getKorisnikById((id.intValue()));
 korisnik.setIme(value);
 System.out.println("Save korisnik");
 korisnikDao.dodajKorisnika(korisnik);
 }
 
}
