/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animation;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

/**
 *
 * @author Denoëla
 */
public class ScenarioDAnimation {
    
    public ArrayList<EffetDAnimation> aScenario;
    
    /**
     * Constructeur par défaut de la classe
     */
    public ScenarioDAnimation(){
        this.aScenario = new ArrayList<>();
    }
    
    /**
     * Constructeur
     * @param pScenario 
     */
    public ScenarioDAnimation(ArrayList<EffetDAnimation> pScenario){
        aScenario = pScenario;
    }
    
    public void ajouterEtape(EffetDAnimation pEffet, int nbRepetitions){
        if(nbRepetitions < 1){
            throw new IllegalArgumentException("Le nombre de répétitions de l'effet doit être supérieur ou égal à 1");
        }
        for(int i=0; i<nbRepetitions; i++){
            this.aScenario.add(pEffet);
        }
    }
    
    public void executeScenario(){
        for(int i=0; i<aScenario.size(); i++){
            aScenario.get(i).executeEffet();
        }
    }
}
