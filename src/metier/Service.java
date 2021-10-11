/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class Service {
    private String libelle;
    private List<Employe> lesEmployes;
    
    public String getLibelle() {
        return libelle;
    }
    
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    
    public List<Employe> getEmployes(){
        return this.lesEmployes;
    }
    
    public void setEmployes(List<Employe> lesEmployes){
        this.lesEmployes = lesEmployes;
    }
    
    public void ajoutEmploye(Employe p){
        if (lesEmployes == null)
        lesEmployes = new ArrayList<Employe>();
        lesEmployes.add(p);
    }
    
    public Service(){
        }
    public Service (String libelle){
        this.libelle=libelle;
        lesEmployes = new ArrayList<Employe>();
        }
    }

