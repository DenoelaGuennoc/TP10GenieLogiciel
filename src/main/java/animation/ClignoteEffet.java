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
