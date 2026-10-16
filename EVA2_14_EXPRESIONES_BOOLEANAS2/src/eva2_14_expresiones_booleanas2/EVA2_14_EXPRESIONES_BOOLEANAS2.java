/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_expresiones_booleanas2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA2_14_EXPRESIONES_BOOLEANAS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //BECA
        //promedio >= 95
        //esta en equipo representativo
        //CAPTURA
        int promedio;
        String equipo;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Pertenece a algun equipo representativo (S/N)? ");
        equipo = captu.nextLine();
        System.out.println("Cual es su promedio: ");
        promedio = captu.nextInt();
        
        
        //CONDICIONES PARA DAR BECA:
        if( (promedio >= 95) || equipo.equals("s")){
            System.out.println("Beca concedida!!");
        }else{
            System.out.println("Beca denegada!!");
        }
    }
    
}
