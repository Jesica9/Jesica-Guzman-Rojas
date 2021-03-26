/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica9;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jesica Guzmán
 */
public class HiloUno extends Thread{
    //variables de clase
    private int tiempo;
    //Constructor con parametros
    public HiloUno(int tiempo){
        this.tiempo=tiempo;
    }
    //Sobreescritura de metodos
    @Override
    public void run(){
        try {
            sleep(tiempo);
        for(int i=0; i<=10; i++){ 

            }
        System.out.println("Termine ejecucion de hilo con tiempo"+(tiempo/1000)+"Segundos");
        }catch (InterruptedException ex) {
                Logger.getLogger(HiloUno.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}
