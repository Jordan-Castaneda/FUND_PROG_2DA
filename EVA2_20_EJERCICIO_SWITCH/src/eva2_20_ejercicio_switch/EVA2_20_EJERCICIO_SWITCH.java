/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_20_ejercicio_switch;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_20_EJERCICIO_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CALCULADORA:
        //PEDIR DOS VALORES ENTEROS.
        //PEDIR LA OPERACION:
        //1 SUMA
        //2 RESTA
        //3 MULTIPLICACION
        //4 DIVISION
        // CUALQUIER OTRO VALOR --> OPERACION INVALIDA
        //MOSTRAR EL RESULTADO
        
        int operacion;
        double x, y, result;
        Scanner captu = new Scanner(System.in);
        
        System.out.print("Introduzca el primer valor: ");
        x = captu.nextInt();
        System.out.print("Introduzca el segundo valor: ");
        y = captu.nextInt();
        System.out.println("Escoga una opcion:");
        System.out.println("1)Suma");
        System.out.println("2)Resta");
        System.out.println("3)Multiplicaion");
        System.out.println("4)Division");
        System.out.print("Que operacion desea realizar: ");
        operacion = captu.nextInt();
        
        switch(operacion){
            case 1:
                result = x + y;
                System.out.println("El resultado es:" + result);
                break;
            case 2:
                result = x - y;
                System.out.println("El resultado es:" + result);
                break;
            case 3:
                result = x * y;
                System.out.println("El resultado es:" + result);
                break;
            case 4:
                result = x / y;
                System.out.println("El resultado es:" + result);
                break;
            default:
                System.out.println("Operacion no valida");
        }
    }
    
}
