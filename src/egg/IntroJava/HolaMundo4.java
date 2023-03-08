/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg.IntroJava;

import java.util.Scanner;

/**
 *
 * @author ffune
 */
public class HolaMundo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = leer.nextInt();
        System.out.println("El doble es:"+numero*2);
        System.out.println("El doble es:"+numero*3);
        System.out.println("Su raiz cuadrada es"+ Math.sqrt(numero));
        
        
    }
    
}
