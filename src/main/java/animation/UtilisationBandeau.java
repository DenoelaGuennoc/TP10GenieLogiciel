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
        
        //EffetDAnimation e = new EffetDAnimation(b);
        
        ZoomEffet z = new ZoomEffet(b);
        TourneEffet t = new TourneEffet(b);
        ClignoteEffet c = new ClignoteEffet(b);
        
        z.zoom(5);
        t.tourneLent();
        t.tourneRapide();
        c.clignote();
    }
}
