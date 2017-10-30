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
public class AtelierConstructionPierre extends Etat{
    @Override
    public void action(){
        while(peutConstruire()){
            ConstruirePioche();
        }
    }
    
    @Override
    public Etat EtatSuivant(){
        System.out.println("construit des pioches en pierre");
        return new Maison();
    }

    public boolean peutConstruire(){
        int nbPierre = 0;
        int nbBois = 0;
        
        //On compte le nombre de pierres et de bois restant dans l'inventaire
        for(int i = 0; i < this.getInventaire().getMateriaux().size(); i++){
            if(this.getInventaire().getMateriaux().get(i) == PIERRE) nbPierre += 1;
            if(this.getInventaire().getMateriaux().get(i) == BOIS) nbBois += 1;
        }
        return (nbBois>=1 && nbPierre >= 3);
    }
    
    public void ConstruirePioche(){
        this.getInventaire().ajouterOutils(PIOCHEPIERRE);
        this.getInventaire().retirerMateriaux(PIERRE, 3);
        System.out.println(" - " + this.getInventaire().getPierre() + " pierres");
        this.getInventaire().retirerMateriaux(BOIS,1);
    }
}
