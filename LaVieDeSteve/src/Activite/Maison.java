/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activite;


public class Maison extends Etat{

    @Override
    public Etat EtatSuivant() {
        Etat res = null;
        
        if(peutVendre()== true)
            res = new Magasin();
        else if(peutCrafter() == true)
            res = new Atelier();
        else if(doitCouper() == true)
            res = new Foret();
        else if(doitMiner() == true)
            res = new Mine();
        else
            return null;
        
        return res;
    }

    public boolean peutVendre(){
        boolean res = false;
        if(this.getInventaire().possedeMateriaux()){res = true;}
        return res;
    }
    
    public boolean peutCrafter(){
        boolean res = false;
        ////////////////////////////////////////////////////////////////////////
        return res;
    }
    
    public boolean doitCouper(){
        boolean res = false;
        ////////////////////////////////////////////////////////////////////////
        return res;
    }
    
    public boolean doitMiner(){
        boolean res = false;
        ////////////////////////////////////////////////////////////////////////
        return res;
    }
    
}
