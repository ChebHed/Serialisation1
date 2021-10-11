/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employés.services;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import metier.Employe;
import metier.Service;

/**
 *
 * @author admin
 */
public class EmployésServices {

    /**
     * @param args the command line arguments
     */
    /*public static void main(String[] args) {
        Service comptabilite = new Service("Comptabilité");
        Employe unEmploye = new Employe("Auchon", "Paul", comptabilite);
        comptabilite.ajoutEmploye(unEmploye);
        unEmploye = new Employe("Ali", "Ghator", comptabilite);
        comptabilite.ajoutEmploye(unEmploye);
        unEmploye = new Employe("Annie", "Zhette", comptabilite);
        comptabilite.ajoutEmploye(unEmploye);
        try{
            serialiser(comptabilite, "employe.xml");
            comptabilite=null;
            comptabilite=(Service) deSerialiser("employes.xml");
            System.out.println(comptabilite.getLibelle());
            for(Employe p: comptabilite.getEmployes()){
            System.out.println(p.getPrenom());
            System.out.println(p.getNom());
            System.out.println(p.getService().getLibelle());}
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }*/
    
    public static void main(String[] args) {
        Service comptabilite = new Service("Comptabilité");
        Employe unEmploye = new Employe("Paul", "Auchon", comptabilite);
        comptabilite.ajoutEmploye(unEmploye);
        unEmploye = new Employe("Ali", "Gathor", comptabilite);
        comptabilite.ajoutEmploye(unEmploye);
        unEmploye = new Employe("Annie", "Zhette", comptabilite);
        comptabilite.ajoutEmploye(unEmploye);
            try {
                //serialiser(comptabilite, "Employes.xml");
                comptabilite = null;
                comptabilite = (Service) deSerialiser("Employes.xml");
                System.out.println(comptabilite.getLibelle());
                    for (Employe p : comptabilite.getEmployes()) {
                        System.out.println(p.getPrenom());
                        System.out.println(p.getNom());
                        System.out.println(p.getService().getLibelle());
                    }
            } catch (Exception ex) {
                ex.printStackTrace();
                }
}
    
    public static void serialiser(Object unObjet, String fichierXML) throws Exception{
        XMLEncoder encoder = new XMLEncoder(new FileOutputStream(fichierXML));
        try{
            encoder.writeObject(unObjet);
        }finally{
            encoder.close();
        }
    }
    
    
    public static Object deSerialiser(String fichierXML) throws Exception{
        Object unObjet=null;
        XMLDecoder decoder = new XMLDecoder(new FileInputStream(fichierXML));
        try{
            unObjet = decoder.readObject();
        }finally{
            decoder.close();
        }
        return unObjet;
    }
}
