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
public class UtilisationBandeau {
    
    public static void main(String [] args){
        Bandeau b = new Bandeau();
        Font font = b.getFont();
        Color back = b.getBackground();
        Color fore = b.getForeground();
        
        b.setMessage("Hello");
        
        EffetDAnimation e = new EffetDAnimation(b);
        
        e.zoom(5);
        e.tourneLent();
        e.tourneRapide();
        e.clignote();
    }
}
