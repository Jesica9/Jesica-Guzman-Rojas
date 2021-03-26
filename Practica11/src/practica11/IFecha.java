/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica11;

import java.util.Calendar;

/**
 *
 * @author Jesica Guzmán
 */
public interface IFecha {
    //Variables de Interfaz
    public static final int DIA_SEMANA=Calendar.DAY_OF_WEEK;
    public static final int DIA_DE_MES=Calendar.DAY_OF_MONTH;
    public static final int MES_DEL_ANIO=Calendar.MONTH;
    public static final int ANIO=Calendar.YEAR;
    
    public abstract String dia();
    public abstract String mes();
    public abstract String anio();
}
