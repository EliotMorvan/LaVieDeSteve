/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laviedesteve;

/**
 *
 * @author em179727
 */
public class LaVieDeSteve {

    public static void main(String[] args) {
        Automate Steve = new Automate();
        int nbJours = 10000;
        Steve.simulation(nbJours);
        System.out.println("En " + nbJours + " jours, Steve a récolté " + Steve.getEtat().getInventaire().Comptes() + " émeraudes.");
    }
    
}
