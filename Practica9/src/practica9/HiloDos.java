/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica9;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jesica Guzmán
 */
public class HiloDos extends Thread{
        @Override
        public void run(){
        try {
            sleep(5000);
        for(int i=0; i<=10; i++){ 

            }
        System.out.println("Termine ejecucion de hilo 2");
        }catch (InterruptedException ex) {
                Logger.getLogger(HiloUno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

