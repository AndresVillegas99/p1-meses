/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meses;

import javax.swing.JOptionPane;

/**
 *
 * @author ville
 */
public class Meses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int meses = 0;
        String MesFin = null;
        int Mes = 0;
        boolean fin = false;
        do 
        {
            
            JOptionPane.showMessageDialog(null, "Introduzca un numero entre el 1 y el 13");

            int Finales = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero"));

            
            switch (Finales) {
                case 1: MesFin = "Enero";
                
                   
                    break;
                case 2:
                    MesFin ="Febrero";
                    break;
                case 3:
                    MesFin ="Marzo";
                    break;
                case 4:
                    MesFin ="Abril";
                    break;
                case 5:
                    MesFin ="Mayo";
                    break;
                case 6:
                    MesFin ="Junio";
                    break;
                case 7:
                    MesFin ="Julio";
                    break;
                case 8:
                    MesFin ="Agosto";
                    break;
                case 9:
                    MesFin ="Septiembre";
                    break;
                case 10:
                    MesFin ="Octubre";
                    break;
                case 11:
                    MesFin ="Noviembre";
                    break;
                case 12:
                    MesFin ="Diciembre";
                    break;
                case 13:
                    MesFin = ("Fin");
                    Mes = 13 ;
            }
             Sysuem.out.printhn(MesFij);
                
            
  $     }       ç
    while (Mes != 13 );
    }

}
