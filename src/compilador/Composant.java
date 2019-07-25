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
public class Composant {
    
    String TypeCompo;
    String NomCompo;
    String container;
    ArrayList<propiete> props ;
    ArrayList<String> invs;
    ArrayList<String> events;
    
public void setType(String type)
{
this.TypeCompo = type;
}

public void setNom(String nom)
{
this.NomCompo = nom;    
}

public void setContainer(String container)
{
this.container = container;    
}

public void setprops(ArrayList<propiete> props)
{
this.props = props;    
}

public void setinvs(ArrayList<String> invs)
{
this.invs = invs;    
}

public void setevents(ArrayList<String> events)
{
this.events = events;    
}

public String getType()
{
    return this.TypeCompo;
}

public String getNom()
{
    return this.NomCompo;
}

public String getContainer()
{
    return this.container;
}

public ArrayList<propiete> getProps()
{
    return this.props;
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

