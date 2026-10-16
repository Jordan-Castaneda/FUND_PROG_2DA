/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_acceso;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_11_ACCESO {
    final static String USUARIO = "admin";
    final static String PWD = "admin";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String usuario, pwd;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Usuario: ");
        usuario = captu.nextLine();
        System.out.println("Contraseña: ");
        pwd = captu.nextLine();
        
        //usuario.equals(USUARIO) UNA ALTERNATIVA SEGURA PARA COMPARAR CADENAS
        if(usuario.equals(USUARIO) && pwd.equals(PWD)){
            System.out.println("ACCESO CONCEDIDO!!!");
        }else{
            System.out.println("ACCESO DENEGADO!!!");
        }
    }
}
