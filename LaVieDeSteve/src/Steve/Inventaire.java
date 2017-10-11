/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Steve;

import static Steve.Materiaux.*;
import static Steve.Outils.*;
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
    public ArrayList<Argent> getOutil(){ return this.argent; }
    public ArrayList<Argent> getMateriaux(){ return this.argent; }
    
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
    * Les éléments de type différents (ex: pierre et fer) doivent être ajoutés séparement
    */
    public void ajouterArgent(Argent unite, int quantite){ for (int i = 0; i < quantite; i++) this.argent.add(unite); }
    public void ajouterOutils(Outils unite, int quantite){ for (int i = 0; i < quantite; i++) this.outils.add(unite); }
    public void ajouterMateriaux(Materiaux unite, int quantite){ for (int i = 0; i < quantite; i++) this.materiaux.add(unite); }
    
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
    
    //fonction permettant de savoir la quantité d'argent
    public int Comptes(){ return this.argent.size(); }
}
