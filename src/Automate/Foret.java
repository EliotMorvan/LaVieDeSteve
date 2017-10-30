/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Automate;

import static GestionInventaire.Materiaux.BOIS;

/**
 *
 * @author em179727
 */
public class Foret extends Etat{
    
    @Override
    public void action(){
        this.getInventaire().ajouterMateriaux(BOIS, 30);
    }
    
    @Override
    public Etat EtatSuivant(){
        System.out.println("va en forêt");
        Etat suivant = new Attente();
        return suivant;
    }
    
}
