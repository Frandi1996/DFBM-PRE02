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
public class Ejercicio05 {
     public static void main(String[] args) {
         
         double n1,n2,n3,n4,n5;
         Scanner entrada= new Scanner (System.in);
         
         System.out.print("*Programa java para saber la media de varios numeros* \n");
         System.out.print("Introduce el primer numero: \n");
         n1=entrada.nextDouble();
         System.out.print("Introduce el segundo numero: \n");
         n2=entrada.nextDouble();
         System.out.print("Introduce el tercer numero: \n");
         n3=entrada.nextDouble();
         System.out.print("Introduce el cuarto  numero: \n");
         n4=entrada.nextDouble();
         System.out.print("Introduce el quinto numero: \n");
         n5=entrada.nextDouble();
         
         double media;
         media=((n1+n2+n3+n4+n5)/5);
         System.out.print("La media seria: \n"+media);
         
}
}
