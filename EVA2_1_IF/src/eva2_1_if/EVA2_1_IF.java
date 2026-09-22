/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_if;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_1_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("¿Cual es tu edad?");
        edad = captu.nextInt();
        //PARENTESIS OBLIGATORIOS, DENTRO DE LA EXPRESIÓN CONDICIONAL (VERDADERO O FALSO)
        if(edad >= 18) {//QUE HACEMOS SI ES VERDAD
            System.out.println("Bienvenido, puedes entrar!!!");
        }else{ //QUE HACEMOS SI ES FALSO (OPCIONAL)
            System.out.println("NO PUEDES ENTRAR (Le da su estatequieto)");
        } 
    }
    
}
