/*
 * Classe regroupant les effets de changement de couleur du texte
 */
package animation;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author Denoëla
 */
public class ChangeCouleurEffet extends EffetDAnimation {
    
    Color aCouleurTexte;
    
    public ChangeCouleurEffet(Bandeau pBandeau, Color pCouleur){
        super(pBandeau);
        this.aCouleurTexte = pCouleur;
    }
    
    /**
     * Fait clignoter le texte une fois
     */
    @Override
    public void executeEffet(){
        this.aBandeau.setForeground(aCouleurTexte);
        this.aBandeau.sleep(100);
    }
}
