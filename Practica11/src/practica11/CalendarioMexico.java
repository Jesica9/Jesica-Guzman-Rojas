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
public class CalendarioMexico implements IFecha, DiasFestivos{

    @Override
    public String dia() {
        return "";
    }

    @Override
    public String mes() {
        return "";
    }

    @Override
    public String anio() {
        return "";
    }

    @Override
    public String festivo(int dia, int mes) {
        String festivo = "";
        if(IFecha.DIA_DE_MES == 15 & IFecha.MES_DEL_ANIO == 9){
            festivo = "Guerra de la independencia de Mexico";
        }
        else{
        festivo = "No se encuentra ningun dia festivo";
        }
        return festivo;
    }

    @Override
    public String conmemorativo() {
       return "";
    }

    @Override
    public String festivo() {
        return "";
    }
    
}
