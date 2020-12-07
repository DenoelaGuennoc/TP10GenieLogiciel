/*
 * Classe regroupant les effets de changement de couleur du fond du bandeau
 */
package animation;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author Denoëla
 */
public class ChangeFondEffet extends EffetDAnimation {
    
    Color aCouleurFond;
    
    public ChangeFondEffet(Bandeau pBandeau, Color pCouleur){
        super(pBandeau);
        this.aCouleurFond = pCouleur;
    }
    
    /**
     * Fait clignoter le texte une fois
     */
    @Override
    public void executeEffet(){
        this.aBandeau.setBackground(aCouleurFond);
        this.aBandeau.sleep(1000);
    }
}
