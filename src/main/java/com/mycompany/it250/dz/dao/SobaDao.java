/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.it250.dz.dao;

import com.mycompany.it250.dz.entities.Sobe;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc
 */
public interface SobaDao {
    
    public ArrayList<Sobe> getListaSvih();
            
    public Sobe getSobaById(Integer sobaId);

    public void dodajSobu(Sobe soba);

    public void obrisiSobu(int sobaId);
    
    public List<Sobe> getListaSobaPoImenu(String ime);
    
   public abstract int allActiveSizeSobe();
   
 public abstract List<Sobe> loadActiveFromTo(int from);
    
}
