/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activite;

/**
 *
 * @author eliot
 */
public class Magasin extends Etat{
    
    @Override
    public void action(){
        
    }
    
    @Override
    public Etat EtatSuivant(){
        Etat suivant = new Attente();
        return suivant;
    }
}
