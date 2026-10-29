/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_33_break;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_33_BREAK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nume;
        int valor = 10;
        Scanner captu = new Scanner(System.in);
        while(true){//ciclo infinito
            System.out.println("Introduce un valor");
            nume = captu.nextInt();
            captu.nextLine();
            
            if(nume == valor){//el usuario adivino y gano, termina el juego
                System.out.println("ADIVINASTE EL VALOR ES 10, GANASTE");
                break;//termina el ciclo
            }
        }
    }
    
}
