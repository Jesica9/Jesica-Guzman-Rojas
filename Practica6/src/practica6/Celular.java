/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica6;

/**
 *
 * @author Jesica Guzmán
 */
public abstract class Celular {
    //variables de clase
    private String marca;
    private String procesador;
    private String diagonalDePantalla;
    private String tamanoBateria;
    private String modelo;
    
    //constructor vacio
    public Celular(){
        this.marca="";
        this.procesador="";
        this.diagonalDePantalla="";
        this.tamanoBateria="";
        this.modelo="";
    }
    //metodo
    public String imprimirInformacion(){
        return "La marca de mi telefono es: "+ marca
                +"y ademas tiene una pantalla de "+diagonalDePantalla
                +" pulgadas";
    }
    public abstract String imprimirMarca();
}
