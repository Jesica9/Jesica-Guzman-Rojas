/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Uptlax.Practica10;

import Uptlax.Practica10.clasesJSON.Persona;
import Uptlax.Practica10.clasesJSON.Personas;
import com.google.gson.Gson;

/**
 *
 * @author Jesica Guzmán
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Archivo archivo = new Archivo("archivos/personas.txt");
        String temp = archivo.leer();
        System.out.println("Este es el JSON: "+temp);
        try{
            Gson gson = new Gson();
            Personas arregloPersonas= gson.fromJson(temp, Personas.class);
            System.out.println("Nuestro arreglo de personas contiene: "+arregloPersonas.getPersonas().size());
            for (int i =0; i< arregloPersonas.getPersonas().size(); i++){
                System.out.println("Numero de personas: " +i);
                System.out.println("El nombre de la persona es: "+arregloPersonas.getPersonas().get(i).getNombre().getNombre());
                System.out.println("La edad de la persona es: "+arregloPersonas.getPersonas().get(i).getEdad());
            }   
        }
        
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        /*archivo.escribir("archivos/nuevo_archivo.txt","Esto es nuevo",false);
        
        Persona persona = new Persona();
        //persona.setNombre("Ulises");
        persona.setCompania("Grupo ABX Business Factory S.A de C.V ");
        persona.setId("1");
        persona.setEdad("27");
        archivo.escribirObjeto(persona,"archivos/persona.data");
        
        Persona personaDesdeArchivo = archivo.leerObjeto("archivos/persona.data");
        System.out.println(personaDesdeArchivo.getNombre());
        System.out.println(personaDesdeArchivo.getCompania());*/
    }

}
