package dfbm.pre02;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author dibom
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        int n;
        // = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero"));

        System.out.println("Dime un número");
        n = sc.nextInt();
        //condicion para analizar si el numero es par o impar
        if (n % 2 == 0) {
            System.out.println("Numero Par y es: " + n);

        } else         
            System.out.println("Numero Impar y es: " + n);
        
    }
}
