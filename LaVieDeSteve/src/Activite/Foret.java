/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activite;

/**
 *
 * @author em179727
 */
public class Foret extends Etat{
    
    @Override
    public void action(){
        
    }
    
    @Override
    public Etat EtatSuivant(){
        Etat suivant = new Attente();
        return suivant;
    }
    
}
