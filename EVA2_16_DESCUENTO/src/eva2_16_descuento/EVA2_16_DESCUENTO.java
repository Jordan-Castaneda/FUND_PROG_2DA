/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_descuento;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA2_16_DESCUENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int edad;
       String est, credencial = "No", insen= "No";
       Scanner captu = new Scanner(System.in);
       
       System.out.println("Cual es su edad? ");
       edad = captu.nextInt();
       est = captu.nextLine();
       System.out.println("Es estudiante (S/N)? ");
       est = captu.nextLine();
       
       if(edad < 18){
           System.out.println("TIENE DESCUENTO!!!");
        }else if(edad >=60){
            System.out.println("Tiene credencial del INSEN (S/N)? ");
            insen = captu.nextLine();
            if(insen.equals("s")){
                System.out.println("TIENES DESCUENTO!!!");
            }else{
                System.out.println("NO TIENES DESCUENTO!!!");
            }
        }else if(edad >= 18 && est.equals("s")){
           System.out.println("Tiene credencial vigente de la escuela? ");
           credencial = captu.nextLine();
           if(credencial.equals("s")){
               System.out.println("TIENES DESCUENTO!!!");
            }else{
               System.out.println("NO TIENES DESCUENTO!!!");
            }
        }else{
           System.out.println("NO TIENE DESCUENTO!!!");
        }
    }
}
