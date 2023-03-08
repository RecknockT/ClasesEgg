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
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros");
        int n1 = leer.nextInt();
        int n2 = leer.nextInt();
        System.out.println(n1+n2);
    }
    
}
