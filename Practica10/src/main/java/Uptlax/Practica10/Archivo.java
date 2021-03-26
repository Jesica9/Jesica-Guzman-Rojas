/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Uptlax.Practica10;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
/**
 *
 * @author Jesica Guzmán
 */
public class Archivo {
//Variables de clase
private String ruta;

//Constructor con parametros
public Archivo(String ruta){
    this.ruta=ruta;
}

//Metodos de clase
public String leer(){
    String contenido="";
    File archivo = null;
    FileReader fileReader = null;
    BufferedReader bufferedReader = null;
    try{
        archivo = new File(this.ruta);
        fileReader = new FileReader(archivo);
        bufferedReader = new BufferedReader(fileReader);
        String linea;
        while ((linea = bufferedReader.readLine()) != null){
            contenido += linea.replace(" ", "");
        }
    }
    catch(Exception e){
        e.printStackTrace();
    }
    finally{
        try {
            bufferedReader.close();
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
    return contenido;
}
public void escribir(String ruta,String cadena, boolean concatenar){
    FileWriter archivo = null;
    PrintWriter printWriter = null;
    try{
        archivo = new FileWriter(ruta, concatenar);
        printWriter = new PrintWriter(archivo);
        printWriter.println(cadena);
        //for (int i = 0; i < 10; i++){
        //    printWriter.println("Linea: "+i);
        //    }
        }
        catch(Exception e){
        e.printStackTrace();
        }
        finally{
        }
    }
    public void escribirObjeto(Persona persona, String ruta){
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
    try{
        fileOutputStream = new FileOutputStream(ruta);
        objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(persona);
    }
    catch(FileNotFoundException ex){
        ex.printStackTrace();
    }
    catch(Exception e){
        e.printStackTrace();
    }
    finally{
        if(objectOutputStream != null){
            try{
                objectOutputStream.close();
            }catch(IOException ex){
                ex.printStackTrace();
            }
        }
    }
}
public Persona leerObjeto(String ruta){
    FileInputStream fileInputStream = null;
    ObjectInputStream objectInputStream = null;
    Persona persona = new Persona();
    try{
        fileInputStream = new FileInputStream(ruta);
        objectInputStream = new ObjectInputStream(fileInputStream);
        persona = (Persona)objectInputStream.readObject();
    }
    catch(Exception e){
        e.printStackTrace();
    }
    finally{
        try{
            objectInputStream.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    return persona;
  }
}
