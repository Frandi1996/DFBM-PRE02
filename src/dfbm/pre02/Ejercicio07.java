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
        try{
        int n1=9,n2=3,c,r; //inicio variable
         Scanner teclado = new Scanner(System.in);
         System.out.println("Introduce el primer numero:");
         n1 = teclado.nextInt(); //muestra un valor por pantalla
         System.out.println("Introduce el segundo numero:");
         n2 = teclado.nextInt();
         c=n1/n2; //muestra el cociente de los numeros introducidos por teclado
         r=n1%n2;//muestra el resto de dos numeros
         System.out.println("");
         System.out.println("cociente "+c);// muestra el resultado del cociente de la division
         System.out.println("Resto "+r);// muestra el resultado del resto de la division
}catch(Exception e){
     System.out.println("Insertar solo numeros");
    
}
}
}
