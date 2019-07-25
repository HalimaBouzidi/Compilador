/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;

/**
 *
 * @author pc
 */
public class Automate {
    
    int q0;           // état initial 
    Liste[][] delta;  // fonction de transition 
    Liste finaux;     // états finaux
    
    void setQ0(int q)
    {
        this.q0 = q;
    }
    
    void setF(Liste f)
    {
        this.finaux = f;
    }
    
    void setTransit(Liste[][]d) {
        this.delta = d;
    }
}
