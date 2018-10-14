/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dfbm.pre02;
import java.util.Scanner;
/**
 *
 * @author dibom
 */
public class Ejercicio07 {
    public static void main(String[] args) {
        int n1=9,n2=3,c,r;
         Scanner teclado = new Scanner(System.in);
         System.out.println("Introduce el primer numero:");
         n1 = teclado.nextInt();
         System.out.println("Introduce el segundo numero:");
         n2 = teclado.nextInt();
         c=n1/n2;
         r=n1%n2;
         System.out.println("");
         System.out.println("cociente "+c);
         System.out.println("Resto "+r);
}
}
