/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Automate;
import static GestionInventaire.Materiaux.*;

public class Maison extends Etat{

    @Override
    public Etat EtatSuivant() {
        System.out.println("- nouvelle journée -");
        System.out.println("est à la maison");
        System.out.println(this.getInventaire().getBois() + " unités de bois");
        System.out.println(this.getInventaire().getFer() + " unités de fer");
        System.out.println(this.getInventaire().getPierre() + " unités de pierre");
        System.out.println(this.getInventaire().getPiochePierre() + " unités de pioches en bois");
        System.out.println(this.getInventaire().getPiocheFer() + " unités de pioches en fer");
        
        Etat Direction;
            
            if(peutVendre()== true)
                Direction = new Magasin();
            else if(peutCrafter() == true)
                Direction = new Atelier();
            else if(doitCouper() == true)
                Direction = new Foret();
            else
                Direction = new Mine();

        
        return Direction;
    }

    public boolean peutVendre(){
        boolean res = false;
        if(this.getInventaire().possedeOutils()) 
            res = true;
        return res;
    }
    
    public boolean peutCrafter(){
        int fer = 0;
        int pierre = 0;
        int bois = 0;
        
        for(int i = 0; i < this.getInventaire().getMateriaux().size(); i++){
            if(this.getInventaire().getMateriaux().get(i) == FER) fer += 1;
            if(this.getInventaire().getMateriaux().get(i) == BOIS) bois += 1;
            if(this.getInventaire().getMateriaux().get(i) == PIERRE) pierre += 1;
        }
        return(bois>=1 && (fer>=3 || pierre>=3));
    }
    
    public boolean doitCouper(){
        return (!this.getInventaire().getMateriaux().contains(BOIS));
    }
    
    public boolean doitMiner(){
        int fer = 0;
        int pierre = 0;
        
        for(int i = 0; i < this.getInventaire().getMateriaux().size(); i++){
            if(this.getInventaire().getMateriaux().get(i) == FER) fer += 1;
            if(this.getInventaire().getMateriaux().get(i) == PIERRE) pierre += 1;
        }
        
        return(fer<3 || pierre<3);
    }
    
}
