/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_estacionamiento;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_9_ESTACIONAMIENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tiempo, costo;
        Scanner captu = new Scanner(System.in);
        
        System.out.print("Cuantas horas usaste el estacionamiento: ");
        tiempo = captu.nextInt();
        
        if (tiempo <= 2){
            System.out.println("$25 por hora");
            costo = tiempo * 25;
            System.out.println("El costo es: $" + costo);
        }else if(tiempo <= 5){
            System.out.println("$20 por hora");
            costo = tiempo * 20;
            System.out.println("El costo es: $" + costo);
        }else if(tiempo <= 10){
            System.out.println("$15 por hora");
            costo = tiempo * 15;
            System.out.println("El costo es: $" + costo);
        }else if(tiempo > 10){
            System.out.println("$150 Fijo");
            costo = 150;
            System.out.println("El costo es: $" + costo);
        }
    }
    
}
