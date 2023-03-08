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
public class HolaMundo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los grados centigrados");
        double c = leer.nextDouble();
        double f;
        f = 32 + (9 * c / 5);
        System.out.println(f);
    }
    
}
