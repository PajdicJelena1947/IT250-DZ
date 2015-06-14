/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.it250.dz.entities;

import com.mycompany.it250.dz.data.Rola;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import org.apache.tapestry5.ioc.annotations.Inject;

/**
 *
 * @author pc
 */


@Entity
@XmlRootElement
@Table(name = "sobe")
@NamedQueries({
@NamedQuery(name = "Sobe.findAll", query = "SELECT s FROM Sobe s")})
public class Sobe extends AbstractEntity  implements Serializable {
     private static final long serialVersionUID = 1L;
    
    @Column(name = "IME")
    private String ime;
    @Column(name = "Sprat")
    private String sprat;
     @Column(name ="Tv")
     private boolean tv;
     @Column (name ="Internet")
     private boolean internet;
     @Column (name ="Terasa")
     private boolean terasa;
     @OneToMany(cascade = CascadeType.ALL, mappedBy = "sobaId")
    private List<Rezervacija> rezervacijeL;
     
     
     @Inject
     public Sobe(){
         
     }



    /**
     * @return the ime
     */
    public String getIme() {
        return ime;
    }

    /**
     * @param ime the ime to set
     */
    public void setIme(String ime) {
        this.ime = ime;
    }

    /**
     * @return the sprat
     */
    public String getSprat() {
        return sprat;
    }

    /**
     * @param sprat the sprat to set
     */
    public void setSprat(String sprat) {
        this.sprat = sprat;
    }

    /**
     * @return the tv
     */
    public boolean isTv() {
        return tv;
    }

    /**
     * @param tv the tv to set
     */
    public void setTv(boolean tv) {
        this.tv = tv;
    }

    /**
     * @return the internet
     */
    public boolean isInternet() {
        return internet;
    }

    /**
     * @param internet the internet to set
     */
    public void setInternet(boolean internet) {
        this.internet = internet;
    }

    /**
     * @return the terasa
     */
    public boolean isTerasa() {
        return terasa;
    }

    /**
     * @param terasa the terasa to set
     */
    public void setTerasa(boolean terasa) {
        this.terasa = terasa;
    }

    /**
     * @return the rezervacijeL
     */
    public List<Rezervacija> getRezervacijeL() {
        return rezervacijeL;
    }

    /**
     * @param rezervacijeL the rezervacijeL to set
     */
    public void setRezervacijeL(List<Rezervacija> rezervacijeL) {
        this.rezervacijeL = rezervacijeL;
    }


   
}
