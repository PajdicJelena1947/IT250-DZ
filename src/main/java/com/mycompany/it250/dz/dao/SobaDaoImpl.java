/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.it250.dz.dao;

import com.mycompany.it250.dz.entities.Sobe;
import static java.lang.ProcessBuilder.Redirect.from;
import java.util.ArrayList;
import java.util.List;
import org.apache.tapestry5.ioc.annotations.Inject;
import static org.apache.tapestry5.json.JSONArray.from;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
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
    @Override
    public List<Sobe> getListaSobaPoImenu(String ime) {
        return session.createCriteria(Sobe.class).add(Restrictions.ilike("ime", ime + "%")).list();
    }

    @Override
    public int allActiveSizeSobe() {
        Long l = (Long)
session.createCriteria(Sobe.class).setProjection(Projections.rowCount()).uniqueResult();
 return l.intValue();
    }

    @Override
    public List<Sobe> loadActiveFromTo(int from) {
     int page = (from - 1) * 20;
 List<Sobe> lista =
session.createCriteria(Sobe.class).setFirstResult(page).setMaxResults(20).addOrder(Order.asc("id")).setResultTransformer(
 Criteria.DISTINCT_ROOT_ENTITY).list();
 return lista;
 }    
    }



    
    

