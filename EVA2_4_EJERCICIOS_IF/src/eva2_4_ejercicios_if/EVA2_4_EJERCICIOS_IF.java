/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_ejercicios_if;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_4_EJERCICIOS_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        double salario, bono = 0, total;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Nombre del empleado:");
        nombre = captu.nextLine();
        System.out.println("Salario mensual del empleado:");
        salario = captu.nextDouble();
        
        if(salario <= 12000){
            bono = salario * 0.1;
            total = salario + bono;
            System.out.println("Tu salario es: $" + total);
        }else{
            bono = salario * 0.05;
            total = salario + bono;
            System.out.println("Tu salario es: $" + total);
        }
    }
    
}
