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
public class MinerPierre extends Etat{
    
    @Override
    public void action(){
        this.getInventaire().ajouterMateriaux(PIERRE, 30);
    }
    
    @Override
    public Etat EtatSuivant(){
        System.out.println("va miner de la pierre");
        return new Maison();
    }
    
}
