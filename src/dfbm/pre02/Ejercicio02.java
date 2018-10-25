package dfbm.pre02;

import java.util.Scanner;

/**
 *
 * @author dibom
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        
        try{
        Scanner sc = new Scanner (System.in);

        int n; //inicio una variable llamada n

        System.out.println("Dime un número"); //imprime por pantalla el numero insertado por teclado
        n = sc.nextInt();
        //condicion para analizar si el numero es par o impar
        if (n % 2 == 0) {
            System.out.println("Numero Par y es: " + n); //imprime por pantalla el resultado de la variable

        } else         
            System.out.println("Numero Impar y es: " + n);//imprime por pantalla el resultado de la variable
        }catch(Exception e){
            System.out.println("Inserte solo caracteres numericos");
        }
        
    }
}
