/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica6;

import java.util.ArrayList;

/**
 *
 * @author Jesica Guzmán
 */
public class Practica6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Esta parte se llama que es una variable polimorfica
        ArrayList<Celular> arreglo= new ArrayList<>();
        
        arreglo.add(new Samsung());
        arreglo.add(new Huawei());
        
        System.out.println(arreglo.get(0).imprimirMarca());
        System.out.println(arreglo.get(1).imprimirMarca());
        
        System.out.println(arreglo.get(0).imprimirInformacion());
        System.out.println(arreglo.get(1).imprimirInformacion());
        
    }
    
}
