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
public class intermediar {
    
    ArrayList<String> invs = null;
    ArrayList<String> events = null;
    
public void setinvs(ArrayList<String> invs)
{
this.invs = invs;    
}

public void setevents(ArrayList<String> events)
{
this.events = events;    
}

public ArrayList<String> getInvs()
{
    return this.invs;
}

public ArrayList<String> getEvents()
{
    return this.events;
}
    
}
