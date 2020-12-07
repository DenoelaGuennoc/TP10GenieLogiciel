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
    
    public boolean aSensHoraire = true;
    
    public TourneEffet(Bandeau pBandeau){
        super(pBandeau);
    }
    
    public TourneEffet(Bandeau pBandeau, int vitesse){
        super(pBandeau, vitesse);
    }
    
    /**
     * @return true si le texte tourne dans le sens horaire
     */
    public boolean getSensRotation(){
        return aSensHoraire;
    }
    
    /**
     * True si le texte tourne dans le sens horaire, false sinon
     * @param sens 
     */
    public void setSensRotation(boolean sens){
        this.aSensHoraire = sens;
    }
    
    /**
     * Fait tourner le texte dans le sens horaire ou anti-horaire à 360°
     */
    @Override
    public void executeEffet(){
        if(aSensHoraire){
            for (int i = 0; i <= 100; i+=aVitesse){
                aBandeau.setRotation(2*Math.PI*i / 100);
                aBandeau.sleep(100);
            }
        }
        else{
            for (int i = 100; i >= 0; i-=aVitesse){
                aBandeau.setRotation(2*Math.PI*i / 100);
                aBandeau.sleep(100);
            }
        }
    }
    
}
