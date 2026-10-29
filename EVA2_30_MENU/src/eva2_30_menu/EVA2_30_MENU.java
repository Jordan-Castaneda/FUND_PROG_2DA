/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_30_menu;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_30_MENU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int opcion;
        
        do{
            System.out.println("--------MENU DEL SISTEMA--------");
            System.out.println("1. VENTAS");
            System.out.println("2. COMPRAS");
            System.out.println("3. PROVEEDORES");
            System.out.println("4. CLIENTES");
            System.out.println("5. SALIR");
            opcion = captu.nextInt();
            captu.nextLine();

        }while(opcion != 5);// != --> diferente de
        //EN TODOS LOS CICLOS: LA REPETICION SE REALIZA CUANDO LA CONDICION ES VERDADERA. TERMINANN CUANDO ES FALSO
        System.out.println("Saliendo del sistema");
    }
    
}
