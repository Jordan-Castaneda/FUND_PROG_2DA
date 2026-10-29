/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_31_do_while_adivinar;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_31_DO_WHILE_ADIVINAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PIDE AL USUARIO ADIVINAR UN NUMERO
        //TERMINA CUANDO ADIVINA EL NUMERO
        
        Scanner captu = new Scanner(System.in);
        int num;
        
        do{
            System.out.print("Adivine un numero del 1 al 10: ");
            num = captu.nextInt();
        }while(num != 4);
        System.out.println("GANASTE!!!");
    }
    
}
