/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_32_continue;

/**
 *
 * @author bisonte
 */
public class EVA2_32_CONTINUE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i = 0; i <=20; i++){
            //para saber si es par, me interesa el residuo de dividir
            //entre dos
            int residuo = i %2;
            if(residuo == 0){//el numero es par
                System.out.print(i + " - ");
                continue;//interrumpe la iteracion actual
            }
            System.out.println("SI EL NUMERO ES PAR, ESTO NO SE IMPRIME");
            
        }
    }
    
}
