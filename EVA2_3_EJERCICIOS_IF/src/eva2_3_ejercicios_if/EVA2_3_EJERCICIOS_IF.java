/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_ejercicios_if;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_3_EJERCICIOS_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double precio, sub, descuento = 0, total;
        int canti;
        Scanner captu = new Scanner(System.in);

        System.out.println("Precio del producto:");
        precio = captu.nextDouble();
        System.out.println("Cantidad del producto:");
        canti = captu.nextInt();
        
        sub = precio * canti;
        if (sub >= 1000){
            descuento = sub * 0.1;
        }
        total = sub - descuento;
        System.out.println("Subtotal = " + sub);
        System.out.println("Descuento = " + descuento);
        System.out.println("Total = " + total);
    }
    
}
