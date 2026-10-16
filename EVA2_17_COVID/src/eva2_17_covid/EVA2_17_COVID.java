/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_17_covid;

import java.util.Scanner;

/**
 *
 * @author conno
 */
public class EVA2_17_COVID {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad;
        double altura, peso, imc;
        String enfermedad;
        Scanner captu = new Scanner(System.in);
        
        System.out.print("Cual es su edad: ");
        edad = captu.nextInt();
        enfermedad = captu.nextLine();
        System.out.print("Tiene alguna enfermedad cronica (S/N)? ");
        enfermedad = captu.nextLine();
        System.out.print("Cual es tu altura (En metros): ");
        altura = captu.nextDouble();
        System.out.print("Cual es tu peso (En kg): ");
        peso = captu.nextDouble();
        
        imc = peso / (altura * altura);
        
        if(edad >= 65 || enfermedad.equals("s") || imc >= 25){
            System.out.println("Usted esta en riesgo de enfermarze de covid!!!");
        }else{
            System.out.println("Usted esta no esta en riesgo");
        }
    }
    
}
