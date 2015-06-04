/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.it250.dz.dao;

import com.mycompany.it250.dz.entities.Sobe;
import java.util.ArrayList;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author pc
 */
public class SobaDaoImpl implements SobaDao {
    
    @Inject
    private Session session;
    
    @Override
    public ArrayList<Sobe> getListaSvih() {
        return (ArrayList<Sobe>) session.createCriteria(Sobe.class).list();
    }
    
    @Override
    public Sobe getSobaById(Integer sobaId) {
        return (Sobe) session.createCriteria(Sobe.class).add(Restrictions.eq("id", sobaId)).uniqueResult();
    }
    
    @Override
    public void dodajSobu(Sobe soba) {
        session.persist(soba);
    }
    
    @Override
    public void obrisiSobu(int sobaId) {
        Sobe sob = (Sobe) session.createCriteria(Sobe.class).add(Restrictions.eq("id", sobaId)).uniqueResult();
        session.delete(sob);
    }
    
}
