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
public class EffetDAnimation {
    
    public Bandeau aBandeau;
    
    public EffetDAnimation(){
        aBandeau = new Bandeau();
    }
    
    public EffetDAnimation(Bandeau pBandeau){
        aBandeau = pBandeau;
    }
    
    public Bandeau getBandeau(){
        return aBandeau;
    }
    
    public void setBandeau(Bandeau pBandeau){
        aBandeau = pBandeau;
    }
}
