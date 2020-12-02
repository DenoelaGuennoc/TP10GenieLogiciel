/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animation;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;
/**
 *
 * @author Denoëla
 */
public class EffetDAnimation {
    
    public Bandeau aBandeau;
    
    public EffetDAnimation(Bandeau pBandeau){
        aBandeau = pBandeau;
    }
    
    /**
     * Augmente la taille de la police en fonction du multiplicateur entré en paramètre
     * de la méthode. Ce paramètre doit être un entier supérieur à 1.
     * @param multiplicateur 
     */
    public void zoom(int multiplicateur){
        if(multiplicateur <= 1){
            throw new IllegalArgumentException ("Le multiplicateur doit être supérieur à 1");
        }
        int tailleFinale = aBandeau.getFont().getSize()*multiplicateur;
        for (int i = aBandeau.getFont().getSize(); i < tailleFinale ; i+=5) {
		aBandeau.setFont(new Font(aBandeau.getFont().getName(),aBandeau.getFont().getStyle(), 5+i));
		aBandeau.sleep(100);
	}
    }
    
    
    
    /**
     * Fait faire un tour complet au texte (lentement)
     */
    public void tourneLent(){
        for (int i = 0; i <= 100; i++) {
		aBandeau.setRotation(2*Math.PI*i / 100);
		aBandeau.sleep(100);
	}
    }
    
    /**
     * Fait faire un tour complet au texte (vite)
     */
    public void tourneRapide(){
        for (int i = 0; i <= 100; i+=10) {
		aBandeau.setRotation(2*Math.PI*i / 100);
		aBandeau.sleep(100);
	}
    }
    
    /**
     * Fait clignoter le texte une fois
     */
    public void clignote(){
        Color back = aBandeau.getBackground();
        Color fore = aBandeau.getForeground();
        aBandeau.sleep(500);
        aBandeau.setForeground(back);
        aBandeau.sleep(500);
        aBandeau.setForeground(fore);
        aBandeau.sleep(500);
    }
    
    
}
