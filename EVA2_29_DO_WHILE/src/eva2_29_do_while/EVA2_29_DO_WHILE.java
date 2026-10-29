/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_29_do_while;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_29_DO_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int monto, cuenta = 5000;
        
        do{//EJECUCION AL MENOS UNA VEZ
            System.out.println("Cuanto quieres retirar?");
            monto = captu.nextInt();
            //acumulador:
            cuenta = cuenta - monto;
            System.out.println("Tu saldo es = " + cuenta);
        }while(cuenta > 0);
        System.out.println("Se te acabo el dinero");
    }
    
}
