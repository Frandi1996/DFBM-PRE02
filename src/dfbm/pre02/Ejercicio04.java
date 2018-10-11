package dfbm.pre02;

import java.util.Scanner;
/**
 *
 * @author dibom
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Muestro dato de entrada
        System.out.print("Ingresa numero: ");
        int num = sc.nextInt();
        
       //Muestro resultado
       System.out.println("El factorial de : "+num+ "es" + factorial(num));
       
    }
    public static double factorial (int n){
        double aux = 1;
        for(int i = 2; i <= n; i++){
            aux *= 1;
        }
        return aux;
    }

}

