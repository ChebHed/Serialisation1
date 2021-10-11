/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;



/**
 *
 * @author admin
 */
public class Employe {
    private String nom;
    private String prenom;
    private Service service;

    public Employe(String nom, String prenom, Service service) {
        this.nom = nom;
        this.prenom = prenom;
        this.service = service;
    }
    
    public Employe(){
        
    }
    
    
    public void setNom(String n){
        this.nom=n;
    }
    
    public String getNom(){
        return this.nom;
    }
    
    public void setPrenom(String p){
        this.prenom=p;
    }
    
    public String getPrenom(){
        return this.prenom;
    }
    
    public void setService(Service S){
        this.service=S;
    }
    
    
    public Service getService(){
        return this.service;
    }
    
    
    
}
