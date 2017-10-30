/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Automate;

import static GestionInventaire.Materiaux.*;

/**
 *
 * @author em179727
 */
public class Atelier extends Etat{
    
    @Override
    public Etat EtatSuivant(){
        System.out.println("va à l'atelier");
        if(peutConstruireFer())
            return new AtelierConstructionFer();
        else
            //Si Steve ne peut pas construire de pioche en fer alors il doit forcément pouvoir en construire en pierre;
            return new AtelierConstructionPierre();
    }

    public boolean peutConstruireFer(){
        int nbFer = 0;
        int nbBois = 0;
        
        //On compte le nombre de pierres et de bois restant dans l'inventaire
        for(int i = 0; i < this.getInventaire().getMateriaux().size(); i++){
            if(this.getInventaire().getMateriaux().get(i) == FER) nbFer += 1;
            if(this.getInventaire().getMateriaux().get(i) == BOIS) nbBois += 1;
        }
        //Steve peut construire une pioche en fer si l'inventaire contient au moins 1 bois et 3 pierres.
        return (nbBois>=1 && nbFer>= 3);
    }
}
