/*
 * Classe regroupant les effets de zoom du bandeau
 */
package animation;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author Denoëla
 */
public class ZoomEffet extends EffetDAnimation {
    
    public ZoomEffet(Bandeau pBandeau){
        super(pBandeau);
    }
    
    /**
     * Multipli la taille du texte par un facteur 5 par défaut
     */
    public void zoom(){
        int tailleFinale = aBandeau.getFont().getSize()*5;
        for (int i = aBandeau.getFont().getSize(); i < tailleFinale ; i+=5) {
		aBandeau.setFont(new Font(aBandeau.getFont().getName(),aBandeau.getFont().getStyle(), 5+i));
		aBandeau.sleep(100);
	}
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
}
