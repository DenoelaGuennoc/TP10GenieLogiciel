/*
 * Classe regroupant les effets de clignotement du bandeau
 */
package animation;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author Denoëla
 */
public class ClignoteEffet extends EffetDAnimation {
    
    public ClignoteEffet(Bandeau pBandeau){
        super(pBandeau);
    }
    
    public ClignoteEffet(Bandeau pBandeau, int vitesse){
        super(pBandeau,vitesse);
    }
    
    /**
     * Fait clignoter le texte une fois
     */
    @Override
    public void executeEffet(){
        Color back = aBandeau.getBackground();
        Color fore = aBandeau.getForeground();
        aBandeau.sleep(500/this.aVitesse);
        aBandeau.setForeground(back);
        aBandeau.sleep(500/this.aVitesse);
        aBandeau.setForeground(fore);
        aBandeau.sleep(500/this.aVitesse);
    }
}
