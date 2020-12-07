/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animation;


import bandeau.Bandeau;
import java.awt.Color;
import static java.awt.Color.*;
import java.awt.Font;
import static java.awt.Transparency.BITMASK;
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
        
        ZoomEffet za = new ZoomEffet(b);
        TourneEffet ta = new TourneEffet(b);
        ClignoteEffet ca = new ClignoteEffet(b);
        DezoomEffet da = new DezoomEffet(b);
        
        ZoomEffet zb = new ZoomEffet(b,5);
        TourneEffet tb = new TourneEffet(b,5);
        ClignoteEffet cb = new ClignoteEffet(b,5);
        DezoomEffet db = new DezoomEffet(b,5);
        
        ZoomEffet zc = new ZoomEffet(b,5);
        TourneEffet tc = new TourneEffet(b,5);
        DezoomEffet dc = new DezoomEffet(b,5);
        zc.setMultiplicateur(4);
        tc.setSensRotation(false);
        dc.setMultiplicateur(4);
        
        ChangeCouleurEffet cca = new ChangeCouleurEffet(b,blue);
        ChangeFondEffet cfa = new ChangeFondEffet(b,red);
             
        ScenarioDAnimation s = new ScenarioDAnimation();
        s.ajouterEtape(za,3);
        s.ajouterEtape(da,3);
        s.ajouterEtape(ca,5);
        s.ajouterEtape(ta,2);
        s.ajouterEtape(cca, BITMASK);
        s.ajouterEtape(zb,3);
        s.ajouterEtape(db,3);
        s.ajouterEtape(cb,5);
        s.ajouterEtape(tb,2);
        s.ajouterEtape(cfa, BITMASK);
        s.ajouterEtape(zc,1);
        s.ajouterEtape(dc,1);
        s.ajouterEtape(tc,2);
        s.executeScenario();
        
        b.close();
    }
}
