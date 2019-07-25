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
public class interafc {
    
    Automate aut;
    ArrayList<Composant> compos;
    
    void setAut(Automate auti)
    {
        this.aut = auti;
    }
    
    void setCompos(ArrayList<Composant> composi)
    {
        this.compos = composi;
    }
    
    Automate getAut()
    {
        return this.aut;
    }
    
    ArrayList<Composant> getCompos()
    {
        return this.compos;
    }
    
}
