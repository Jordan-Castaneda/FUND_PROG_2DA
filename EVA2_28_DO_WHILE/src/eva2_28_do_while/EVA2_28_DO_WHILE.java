/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_28_do_while;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_28_DO_WHILE {
    static final String USUARIO = "admin";
    static final String CONTRA = "admin";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        String usu, pwd;
        
        do{
            System.out.println("Usuario:");
            usu = captu.nextLine();
            System.out.println("Contraseña:");
            pwd = captu.nextLine();
            
        }while(!(usu.equals(USUARIO)) || !(pwd.equals(CONTRA)));
        System.out.println("ACCESO CONCEDIDO!!!!");
    }
    
}
