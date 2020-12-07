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
public abstract class EffetDAnimation {
    
    public Bandeau aBandeau;
    public int aVitesse;
    
    public EffetDAnimation(Bandeau pBandeau){
        this.aBandeau = pBandeau;
        this.aVitesse = 1;
    }
    
    public EffetDAnimation(Bandeau pBandeau, int vitesse){
        aBandeau = pBandeau;
        if(vitesse < 1){
            throw new IllegalArgumentException ("la vitesse d'un effet doit être supérieure à 1");
        }
        else {
            this.aVitesse = vitesse;
        }
    }
    
    public Bandeau getBandeau(){
        return aBandeau;
    }
    
    public void setBandeau(Bandeau pBandeau){
        aBandeau = pBandeau;
    }
    
    public int getVitesse(){
        return aVitesse;
    }
    
    public void setVitesse(int vitesse){
        aVitesse = vitesse;
    }
    
    public abstract void executeEffet();
}
