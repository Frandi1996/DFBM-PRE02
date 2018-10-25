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
public class Ejercicio06 {
    public static void main(String[] args) {
        try{
        Scanner t = new Scanner(System.in);
        
        int N, fin=77;
        
        System.out.print("Numero mayor a 77:");
        N = t.nextInt();
        
        if(N > 77){
            for(int i=1; i<=N; i++){
                fin = fin +i;   
            }
           System.out.println("El valor total es: "+fin);
           System.out.println("Numero/s introducidos: "+N);
           
           }else{
                System.out.println("El valor introducido no es mayor o igual de 77");
                System.out.println("Numero/s introducidos: "+N);
        }
        }catch(Exception e){
            System.out.println("");
        }
}
}
