/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uptlax.PracticaSerializacion;

import java.util.ArrayList;

/**
 *
 * @author Jesica Guzmán
 */
public class Personas {
    //variables de clase
    ArrayList<Persona> personas;
    
    //Constructor vacio
    public Personas(){
        this.personas = new ArrayList<>();
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }
    
}
