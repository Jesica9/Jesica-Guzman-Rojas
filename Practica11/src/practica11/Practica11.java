/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica11;

/**
 *
 * @author Jesica Guzmán
 */
public class Practica11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //clases wrapper
        int entero = 100;
        double doble=10.50;
        float flotante= 11.50f;
        char caracter;
        System.out.println("El valor del doble es: "+doble);
        //Hacemos un casteo de variables
        System.out.println("El valor casteado de doble es: "+((int)doble));
        System.out.println("El valor del entero es: "+entero);
        //Hacemos un casteo de variables
        System.out.println("El valos casteado de entero a doble es: "+((double)entero));
        //Clases wrapper
        String cadena="";
        Integer enteroClase=10;
        Integer enteroClaseDos = 20;
        Double dobleClase=10.50;
        Float flotanteClase=11.50f;
        
        // == 
        enteroClase.compareTo(enteroClaseDos);
        Integer miEntero = Integer.parseInt("100");
        System.out.println("El valor de la clase es: "+miEntero);
        
        try{
            Double.parseDouble("t");
        }
        catch(NumberFormatException ex){
            //ex.printStackTrace();
            
        }
        catch(Exception e){
            //e.printStackTrace();
        }
        MiCalendario calendario = new MiCalendario();   
        CalendarioMexico calendarioMexico = new CalendarioMexico();
        String temp = calendarioMexico.festivo(15,9);
        System.out.println(temp);
        System.out.println(calendario.dia());
                
        MiCalendario calendarioDos = new MiCalendario();
        CalendarioMexico calendarioMexicoDos = new CalendarioMexico();
        System.out.println(calendarioDos.mes());
    }
    
}
