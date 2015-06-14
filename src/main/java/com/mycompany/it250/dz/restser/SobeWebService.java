/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.it250.dz.restser;

import com.mycompany.it250.dz.dao.SobaDao;
import com.mycompany.it250.dz.entities.Sobe;
import java.util.List;
import javax.ws.rs.core.Response;
import org.apache.tapestry5.ioc.annotations.Inject;

/**
 *
 * @author pc
 */
public class SobeWebService implements SobeServiceInterface{

    @Inject
    private SobaDao sobaDao;
    @Override
    public List<Sobe> getAll() {
         return (List<Sobe>) sobaDao.getListaSvih();
    }

    @Override
    public Sobe getById(Integer id) {
       return sobaDao.getSobaById(id);
    }

    @Override
    public Response post(Sobe soba) {
        sobaDao.dodajSobu(soba);
        return Response.ok().entity(soba).build();
    }
    
}
