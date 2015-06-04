/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.it250.dz.pages;

import com.mycompany.it250.dz.data.Hotel;
import com.mycompany.it250.dz.services.ProtectedPage;
import java.util.ArrayList;
import javax.annotation.security.RolesAllowed;
import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;

/**
 *
 * @author pc
 */

@ProtectedPage
@RolesAllowed(value={"Administrator"})
public class DodajHotel {
    
    @Persist
    @Property
    private ArrayList<Hotel> hoteli;
    @Property
    private Hotel hotel;

    void onActivate() {
        if (hoteli == null) {
            hoteli = new ArrayList<Hotel>();
        }
    }

    Object onSuccess() {
       hoteli.add(hotel);
        return this;
    }
    
}
