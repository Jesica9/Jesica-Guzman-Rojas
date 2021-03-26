/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica9;

/**
 *
 * @author Jesica Guzmán
 */
public class Practica9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HiloUno hilo = new HiloUno(15000);
        hilo.start();
        
        HiloUno segundoHilo = new HiloUno(1000);
        segundoHilo.start();
        
        HiloUno tercerHilo = new HiloUno(20000);
        tercerHilo.start();
        
        HiloUno cuartoHilo = new HiloUno(5000);
        cuartoHilo.start();
    }
    
}
