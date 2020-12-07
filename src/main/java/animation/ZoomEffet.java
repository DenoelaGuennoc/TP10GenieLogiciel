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
    
    int aMultiplicateur;
    
    public ZoomEffet(Bandeau pBandeau){
        super(pBandeau);
        this.aMultiplicateur = 1;
    }
    
    public ZoomEffet(Bandeau pBandeau, int vitesse){
        super(pBandeau, vitesse);
        this.aMultiplicateur = 1;
    }
    
    public int getMultiplicateur(){
        return aMultiplicateur;
    }
    
    public void setMultiplicateur(int multiplicateur){
        if(multiplicateur < 1){
            throw new IllegalArgumentException ("le multiplicateur du zoom doit être supérieur à 1");
        }
        else{
            this.aMultiplicateur = multiplicateur;
        }
    }
    
    /**
     * Augmente la taille de la police en fonction du multiplicateur associé à l'objet
     */
    @Override
    public void executeEffet(){
        int tailleFinale = aBandeau.getFont().getSize()*aMultiplicateur;
        for (int i = aBandeau.getFont().getSize(); i < tailleFinale ; i+= this.aVitesse) {
		aBandeau.setFont(new Font(aBandeau.getFont().getName(),aBandeau.getFont().getStyle(), i));
		aBandeau.sleep(100);
	}
    }
    
}
