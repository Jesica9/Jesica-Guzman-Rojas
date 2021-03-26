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
public class MiCalendario implements IFecha, DiasFestivos {
    //Sobreescritura de metodos 
    @Override
    public String dia() {
        String dia="";
        if(IFecha.DIA_SEMANA == 1){
            dia="Lunes";
        }
        //if(IFecha.DIA_SEMANA == 2){
        //    dia ="Martes";
        //}
        return "El dia "+IFecha.DIA_DE_MES+" es "+dia ;
    }
    //Sobreescritura de metodos
    @Override
    public String mes() {
        String mes ="";
        if(IFecha.DIA_DE_MES == 1){
            mes = "Enero";
        }
        if(IFecha.DIA_DE_MES == 2){
            mes = "Febrero";
        }
        return "El mes "+IFecha.MES_DEL_ANIO+" es "+mes;
    }
    //Sobreescritura de metodos
    @Override
    public String anio() {
       return String.valueOf(IFecha.ANIO);
    }

    @Override
    public String festivo() {
        String festivo = "";
        if(IFecha.DIA_DE_MES == 8 & IFecha.MES_DEL_ANIO == 9){
            festivo = "Felicidades por tu cumpleaños";
        }
        return festivo;
    }

    @Override
    public String conmemorativo() {
        return "";
    }

    @Override
    public String festivo(int dia, int mes) {
        return "";
    }
    
}
