/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;

import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class propiete {
    ArrayList<String> nomProp;
    String typeProp;
    
    void setNom(ArrayList<String> nom) 
    {
     this.nomProp = nom;   
    }
    
    void setType(String type)
    {
        this.typeProp = type;
    }
    
    ArrayList<String> getNom() 
    {
        return this.nomProp;
    }
    String getType()
    {
        return this.typeProp;
    }
}
