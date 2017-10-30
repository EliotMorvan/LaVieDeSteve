/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Automate;

import static GestionInventaire.Materiaux.*;

/**
 *
 * @author eliot
 */
public class MinerFer extends Etat{
    
    @Override
    public void action(){
        for(int i=0; i<30; i++){
            if(Math.random() <= 0.2)
                this.getInventaire().ajouterMateriaux(FER);
            else
                this.getInventaire().ajouterMateriaux(PIERRE);
        }
    }
    
    @Override
    public Etat EtatSuivant(){
        System.out.println("va miner du fer");
        return new Maison();
    }
}
