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
public class Attente extends Etat{
    
    @Override
    public Etat EtatSuivant(){
        return new Maison();
    }
    
}
