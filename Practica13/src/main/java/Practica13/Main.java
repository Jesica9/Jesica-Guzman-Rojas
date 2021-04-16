/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica13;

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
        //leemos el archivo
        Archivo archivo = new Archivo("archivos/usuarios.json");
        //Obtenemos la informacion del archivo en forma de String
        String json = archivo.leer();
        System.out.println("El contenido del archivo es: "+json+ "usuarios");
        try{
        //Generamos la variable para serializar
        Gson gson = new Gson();
        //Serializamos la informacion del json en objetos
        Usuarios usuarios = gson.fromJson(json, Usuarios.class);
        //Imprimos la informacion serializada
        System.out.println("Yo tengo:"+usuarios.getUsuarios().size());
        }
    catch(Exception e){
        System.out.println("Error"+e.getMessage());
        }
    }
    
}
