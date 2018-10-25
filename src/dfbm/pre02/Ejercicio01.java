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
public class Ejercicio01 {
    public static void main(String[] args) {
        
        try{
        Scanner sc=new Scanner(System.in);//declarado objeto scanner
        int edad=sc.nextInt();// almacenado la edad en la variable edad
        
           System.out.println("Ingrese edad:");
        if(edad>=18){// condicion si la edad es mayor o igual a 18
            System.out.println("Es mayor de edad");//si la condicion cumple
        }
        else{
            System.out.println("Es menor de edad");//cuando no cumple la condicion
        
        }
        }catch(Exception e){
            System.out.println("Inserte solo numeros");
        }
    }
}
        
                
    



