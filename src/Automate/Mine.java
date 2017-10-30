/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Automate;

/**
 *
 * @author em179727
 */
public class Mine extends Etat{
    
    @Override
    public Etat EtatSuivant(){
        System.out.println("va à la mine");
        Etat suivant;
        
        if(Math.random() <= (double)1/3){
            suivant = new MinerFer();}
        else{
            suivant = new MinerPierre();}
        
        return suivant;
    }
    
}