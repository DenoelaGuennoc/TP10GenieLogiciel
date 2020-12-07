/*
 * Classe regroupant les effets de dézoom du bandeau
 */
package animation;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author Denoëla
 */
public class DezoomEffet extends EffetDAnimation {
    
    int aMultiplicateur;
    
    public DezoomEffet(Bandeau pBandeau){
        super(pBandeau);
        this.aMultiplicateur = 2;
    }
    
    public DezoomEffet(Bandeau pBandeau, int vitesse){
        super(pBandeau, vitesse);
        this.aMultiplicateur = 2;
    }
    
    public int getMultiplicateur(){
        return aMultiplicateur;
    }
    
    public void setMultiplicateur(int multiplicateur){
        if(multiplicateur < 2){
            throw new IllegalArgumentException ("le multiplicateur du zoom doit être supérieur ou égal à 2");
        }
        else{
            this.aMultiplicateur = multiplicateur;
        }
    }
    
    /**
     * Diminue la taille de la police en fonction du multiplicateur associé à l'objet
     */
    @Override
    public void executeEffet(){
        int tailleFinale = aBandeau.getFont().getSize() / aMultiplicateur;
        for (int i = aBandeau.getFont().getSize(); i > tailleFinale ; i-= this.aVitesse) {
		aBandeau.setFont(new Font(aBandeau.getFont().getName(),aBandeau.getFont().getStyle(), i));
		aBandeau.sleep(100);
	}
    }
    
}
