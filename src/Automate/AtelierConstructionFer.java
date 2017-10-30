/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Automate;

import static GestionInventaire.Materiaux.*;
import static GestionInventaire.Outils.*;

/**
 *
 * @author eliot
 */
public class AtelierConstructionFer extends Etat{
    
    @Override
    public void action(){
        while(peutConstruire())
            ConstructionFer();
    }
    
    @Override
    public Etat EtatSuivant(){
        System.out.println("Construit des pioches en fer");
        return new Maison();
    }

    public boolean peutConstruire(){
        int nbFer = 0;
        int nbBois = 0;
        
        //On compte le nombre de fer restantes dans l'inventaire
        for(int i = 0; i < this.getInventaire().getMateriaux().size(); i++){
            if(this.getInventaire().getMateriaux().get(i) == FER) nbFer += 1;
            if(this.getInventaire().getMateriaux().get(i) == BOIS) nbBois += 1;
        }
        //Steve peut construire une pioche en pierre si l'inventaire contient au moins un bois et 3 fers.
        return ( nbBois>=1 && nbFer >= 3);
    }
    
    public void ConstructionFer(){
        this.getInventaire().ajouterOutils(PIOCHEFER);
        this.getInventaire().retirerMateriaux(FER, 3);
        System.out.println(" - " + this.getInventaire().getFer() + " fer");
        this.getInventaire().retirerMateriaux(BOIS,1);
    }
}
