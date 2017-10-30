/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Automate;

import static GestionInventaire.Argent.*;
import GestionInventaire.Outils;
import static GestionInventaire.Outils.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author eliot
 */
public class Magasin extends Etat{
    
    @Override
    public void action(){
        
        ArrayList<Outils> outils = this.getInventaire().getOutils();
        Iterator<Outils> i = outils.iterator();
        while(i.hasNext()) {
            Outils o = i.next();
            if(o == PIOCHEFER) {
                i.remove();
                this.getInventaire().ajouterArgent(DIAMANT, 4);
            } else {
                i.remove();
                this.getInventaire().ajouterArgent(DIAMANT, 2);
            }
        }
    }
    
    @Override
    public Etat EtatSuivant(){
        System.out.println("va au magasin");
        Etat suivant = new Attente();
        return suivant;
    }
}
