/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activite;

import Steve.Inventaire;

public abstract class Etat {
    private Inventaire inventaire = new Inventaire();
    
    public void action(){}
    public Etat EtatSuivant(){ return null; }
    public Inventaire getInventaire() { return inventaire; }
}
