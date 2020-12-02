/*
 * Classe regroupant les effets de rotation du bandeau
 */
package animation;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;
/**
 *
 * @author Denoëla
 */
public class TourneEffet extends EffetDAnimation {
    
    public TourneEffet(Bandeau pBandeau){
        super(pBandeau);
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
}
