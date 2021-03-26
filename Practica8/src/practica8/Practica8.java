/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica8;

import java.io.IOError;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Jesica Guzmán
 */
public class Practica8 {

    /**
     * @param args the command line   arguments
     */
    public static void main(String[] args) {
            try{
            //El arreglo de los objetos esta vacio
            //ArrayList<Usuario> arreglo = new ArrayList<>();
            //arreglo.get(0).getCorreo();
            int a=10,b=11;
            if(a > b){
                System.out.println("Todo esta bien");
            }
            else{
                throw new IOException();
            }
        }
            catch(IOException e){
                System.out.println("Este es un error de lectura y escritura de archivos" +e.getMessage());
            }
            //Esto error es de jerarquia menor
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Acabas de entrar en un error de posición de arreglo"+e.getMessage());
        }
            //Este errores de jerarquia mayor
        catch(Exception e){
            System.out.println("Esto es un error"+e.getMessage());
        }
        finally{
             System.out.println("Aca puedes poner codigo que quieren que se ejecute despues de una exception");
        }
    }
    
}
