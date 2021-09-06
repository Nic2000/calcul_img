package com.example.coach.controleur.modele;

import junit.framework.TestCase;

public class ProfilTest extends TestCase {
    //creation profil
    private Profil profil = new Profil(47,145,35,0);
    //resultat img correspondant
    private float img = (float) 32.2;
    private String message = "trop élevée";

    public void testGetImg() {
        assertEquals(img,profil.getImg(),(float) 0.1);
    }

    public void testGetMessage() {
        assertEquals(message,profil.getMessage());
    }
}