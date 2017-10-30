/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laviedesteve;

import Automate.Maison;
import Automate.Etat;

/**
 *
 * @author em179727
 */
public class Automate {
    
    private static Etat Etat_courant = new Maison();

    public Etat getEtat(){
        return this.Etat_courant;
    }
    
    public void simulation(int nbJours){
        for(int i = 0; i < nbJours*3; i++){
            Etat_courant.action();
            Etat_courant = Etat_courant.EtatSuivant();
        }
    }
}
