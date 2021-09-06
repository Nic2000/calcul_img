package com.example.coach.controleur.controleur;

import com.example.coach.controleur.modele.Profil;

public final class Controle {
    private static Controle instance = null;
    private static Profil profil;

    private Controle(){
        super();
    }

    /**
     * création de l'instance
     * @return
     */
    public static final Controle getInstance(){
        if(Controle.instance == null){
            Controle.instance = new Controle();
        }
        return Controle.instance;
    }

    /**
     *Création du profil
     * @param poids
     * @param taille en cm
     * @param age
     * @param sexe 1 pour homme, 0 pour femme
     */
    public void createProfil(Integer poids,Integer taille, Integer age, Integer sexe){
        profil = new Profil(poids,taille,age,sexe);
    }

    /**
     * récupération img de profil
     * @return img
     */
    public float getImg(){
        return profil.getImg();
    }
    public String getMessage(){
        return profil.getMessage();
    }
}
