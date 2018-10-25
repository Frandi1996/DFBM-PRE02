package dfbm.pre02;

import java.util.Scanner;
/**
 *
 * @author dibom
 */
public class Ejercicio04 {
    public static void main(String[] args) {
       try{
        Scanner sc = new Scanner(System.in);
        
        //Muestro dato de entrada
        System.out.print("Ingresa numero: ");
        int num = sc.nextInt();
        
       //Muestro resultado
       System.out.println("El factorial de : "+num+ "es" + factorial(num));
       }catch(Exception e){
           System.out.println("Inserta solo numeros");
       }
    }
    public static double factorial (int n){
        double aux = 1;
        for(int i = 2; i <= n; i++){
            aux *= 1;
        }
        return aux;
    }

}

