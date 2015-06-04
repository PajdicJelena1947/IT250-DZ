/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.it250.dz.entities;

import com.mycompany.it250.dz.data.Rola;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.apache.tapestry5.ioc.annotations.Inject;

/**
 *
 * @author pc
 */

@Entity
@Table(name = "rezervacije")
@NamedQueries({
    @NamedQuery(name = "Rezervacije.findAll", query = "SELECT r FROM Rezervacije r")})
public class Rezervacija  extends AbstractEntity  implements Serializable {
    
    
    
    private static final long serialVersionUID = 1L;
    
    @Basic(optional = false)
    @Column(name = "ime")
    private String ime;
    @Basic(optional = false)
    @Column(name = "prezime")
    private String prezime;
    @Basic(optional = false)
    @Column(name = "datum")
    @Temporal(TemporalType.DATE)
    private Date datum;
    @Basic(optional = false)
    @Column(name = "broj_dana")
    private int brojDana;
    
    
    @JoinColumn(name = "sobaId", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Sobe sobaId;
    
    
    @Inject
    public Rezervacija(){
        
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
     * @return the prezime
     */
    public String getPrezime() {
        return prezime;
    }

    /**
     * @param prezime the prezime to set
     */
    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    /**
     * @return the datum
     */
    public Date getDatum() {
        return datum;
    }

    /**
     * @param datum the datum to set
     */
    public void setDatum(Date datum) {
        this.datum = datum;
    }

    /**
     * @return the brojDana
     */
    public int getBrojDana() {
        return brojDana;
    }

    /**
     * @param brojDana the brojDana to set
     */
    public void setBrojDana(int brojDana) {
        this.brojDana = brojDana;
    }

    /**
     * @return the sobaId
     */
    public Sobe getSobaId() {
        return sobaId;
    }

    /**
     * @param sobaId the sobaId to set
     */
    public void setSobaId(Sobe sobaId) {
        this.sobaId = sobaId;
    }

   
}
