/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionInventaire;

import static GestionInventaire.Materiaux.*;
import static GestionInventaire.Outils.*;
import java.util.ArrayList;

/**
 *
 * @author eliot
 */
public class Inventaire {
    
    /*
    * L'inventaire de Steve est composé d'argent, d'outils et de matériaux.
    * Cette classe gère l'équipement et permet d'effectuer des tests.
    */
    private ArrayList<Argent> argent = new ArrayList<Argent>();
    private ArrayList<Outils> outils = new ArrayList<Outils>();
    private ArrayList<Materiaux> materiaux = new ArrayList<Materiaux>();
    
    /*
    * Implémentation des Setter et Getteur
    */
    public ArrayList<Argent> getArgent(){ return this.argent; }
    public ArrayList<Outils> getOutils(){ return this.outils; }
    public ArrayList<Materiaux> getMateriaux(){ return this.materiaux; }
    
    public void setArgent(ArrayList<Argent> NouvelleBourse){ this.argent = NouvelleBourse; } 
    public void setOutils(ArrayList<Outils> NouvelleBourse){ this.outils = NouvelleBourse; } 
    public void setMateriaux(ArrayList<Materiaux> NouvelleBourse){ this.materiaux = NouvelleBourse; } 
    
    /*
    * Tests permettant de voir si la liste n'est pas vide.
    */
    public boolean possedeArgent() { return !argent.isEmpty(); }
    public boolean possedeOutils() { return !outils.isEmpty(); }
    public boolean possedeMateriaux() { return !materiaux.isEmpty(); }
    
    /*
    * Ajouter un élément à la liste
    */
    public void ajouterArgent(Argent unite){ this.argent.add(unite); }
    public void ajouterOutils(Outils unite){ this.outils.add(unite); }
    public void ajouterMateriaux(Materiaux unite){ this.materiaux.add(unite); }
    
    /*
    * Ajouter plusieurs éléments à la liste
    * Les éléments de types différents (ex: pierre et fer) doivent être ajoutés séparement
    */
    public void ajouterArgent(Argent unite, int quantite){ for (int i = 0; i < quantite; i++) this.argent.add(unite); }
    public void ajouterOutils(Outils unite, int quantite){ for (int i = 0; i < quantite; i++) this.outils.add(unite); }
    public void ajouterMateriaux(Materiaux unite, int quantite){ for (int i = 0; i < quantite; i++) this.materiaux.add(unite); }
    
    /*
    * Retirer plusieurs éléments de la liste matériaux
    * Les éléments de types différents doivent être ajoutés séparement.
    */
    public void retirerMateriaux(Materiaux m, int n) {
        for(int i = 0 ; i < n ; i++) {
            for(Materiaux materiaux : this.materiaux) {
                if(materiaux == m) {
                    this.materiaux.remove(materiaux);
                    break;
                }
            }    
        }        
    }
    
    /*
    * Parcours de la lste outils pour trouver les pioches enum précises 
    * et renvoyer true si Steve les possède
    */
    public boolean possedePiocheFer(){ return this.outils.contains(PIOCHEFER); }
    public boolean possedePiochePierre(){ return this.outils.contains(PIOCHEPIERRE); }
    
    /*
    * Parcours de la lste materiaux pour trouver les matériaux précis
    */
    public boolean possedeMateriauxPierre(){ return this.materiaux.contains(PIERRE); }
    public boolean possedeMateriauxFer(){ return this.materiaux.contains(FER); }
    public boolean possedeMateriauxBois(){ return this.materiaux.contains(BOIS); }
    
    /*
    * fonction permettant de savoir la quantité d'argent
    */
    public int Comptes(){ return this.argent.size(); }
    
    /*
    * retourne le nomnbre de pierre dans l'inventaire
    */
    public int getPierre(){
        int pierre = 0;
        for(int i = 0; i < this.getMateriaux().size(); i++){
            if(this.getMateriaux().get(i) == PIERRE) pierre += 1;
        }
        return pierre;
    }
    
    /*
    * retourne le nomnbre de fer dans l'inventaire
    */
    public int getFer(){
        int fer = 0;
        for(int i = 0; i < this.getMateriaux().size(); i++){
            if(this.getMateriaux().get(i) == FER) fer += 1;
        }
        return fer;
    }
    
    /*
    * retourne le nomnbre de pierre dans l'inventaire
    */
    public int getBois(){
        int bois = 0;
        for(int i = 0; i < this.getMateriaux().size(); i++){
            if(this.getMateriaux().get(i) == BOIS) bois += 1;
        }
        return bois;
    }
    
    /*
    * retourne le nomnbre de pierre dans l'inventaire
    */
    public int getPiochePierre(){
        int PiocheP = 0;
        for(int i = 0; i < this.getOutils().size(); i++){
            if(this.getOutils().get(i) == PIOCHEPIERRE) PiocheP += 1;
        }
        return PiocheP;
    }
    
    /*
    * retourne le nomnbre de pierre dans l'inventaire
    */
    public int getPiocheFer(){
        int PiocheF = 0;
        for(int i = 0; i < this.getOutils().size(); i++){
            if(this.getOutils().get(i) == PIOCHEFER) PiocheF += 1;
        }
        return PiocheF;
    }
    
    
}
