/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.it250.dz.pages;

import com.mycompany.it250.dz.dao.SobaDao;
import com.mycompany.it250.dz.entities.Sobe;
import com.mycompany.it250.dz.services.ProtectedPage;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.security.RolesAllowed;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.hibernate.annotations.CommitAfter;
import org.apache.tapestry5.ioc.annotations.Inject;

/**
 *
 * @author pc
 */
@ProtectedPage
@RolesAllowed(value={"Administrator"})
public class DodajSobu {
   @Property
    private Sobe soba;
    @Property
    private Sobe onesoba;
    @Inject
    private SobaDao sobaDao;
    @Property
    private List<Sobe> sobe;

    void onActivate() {
        if (sobe == null) {
            sobe = new ArrayList<Sobe>();
        }
        sobe = sobaDao.getListaSvih();
    }

   
    Object onSuccess() {
        sobaDao.dodajSobu(soba);
        return this;
    }

    Object onActionFromDelete(int sobaId) {
        sobaDao.obrisiSobu(sobaId);
        return this;
    } 
}
