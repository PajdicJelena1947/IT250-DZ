/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.it250.dz.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import org.apache.tapestry5.ioc.annotations.Inject;

/**
 *
 * @author pc
 */

@Entity
@Table(name = "korisnik")
@NamedQueries({
 @NamedQuery(name = "Korisnik.findAll", query = "SELECT k FROM Korisnik k")})

public class Korisnik implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "KorisnikID")
    private Integer korisnikId;
    @Column(name = "IME")
    private String ime;
    @Column(name = "PREZIME")
    private String prezime;
    @Column(name = "JMBG")
    private String jmbg;
    
    
    @Inject
    public Korisnik() {
    }
    public Korisnik(Integer korisnikId,String ime,String prezime,String jmbg){
      this.ime=ime;
      this.prezime=prezime;
      this.korisnikId=korisnikId;
      this.jmbg=jmbg;
        
    }

    /**
     * @return the korisnikId
     */
    public Integer getKorisnikId() {
        return korisnikId;
    }

    /**
     * @param korisnikId the korisnikId to set
     */
    public void setKorisnikId(Integer korisnikId) {
        this.korisnikId = korisnikId;
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
     * @return the jmbg
     */
    public String getJmbg() {
        return jmbg;
    }

    /**
     * @param jmbg the jmbg to set
     */
    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }
    
    
    
    }
   

    
    
    


   