package dfbm.pre02;

import java.util.Scanner;
/**
 *
 * @author dibom
 */
public class Ejercicio03 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
	int lectura;
	System.out.print("Introduzca el numero del mes del que quiere conocer los dias: \n");
	
        System.out.println("1.Enero");
        System.out.println("2.Febrero");
        System.out.println("3.Marzo");
        System.out.println("4.Abril");
        System.out.println("5.Mayo");
        System.out.println("6.Junio");
        System.out.println("7.Julio");
        System.out.println("8.Agosto");
        System.out.println("9.Septiembre");
        System.out.println("10.Octubre");
        System.out.println("11.Noviembre");
        System.out.println("12.Diciembre");
	lectura = sc.nextInt();

switch(lectura)
     {           
              
     		case 1:
                    System.out.print("Este mes tiene 31 dias");
			break;
		case 2:
                    System.out.print("Este mes tiene 28 o 29 dias");
			break;
                case 3:
                    System.out.print("Este mes tiene 31 dias");
			break;              
                case 4:
                    System.out.print("Este mes tiene 31 dias");
			break;
		case 5:
                    System.out.print("Este mes tiene 31 dias");
			break;
                case 6:
                    System.out.print("Este mes tiene 31 dias");
			break;
		case 7:
                    System.out.print("Este mes tiene 31 dias");
			break;
		case 8:
                    System.out.print("Este mes tiene 31 dias");
			break;
                case 9:
                    System.out.print("Este mes tiene 30 dias");
			break;        
		case 10:
                    System.out.print("Este mes tiene 31 dias");
			break;
                case 11:
			System.out.print("Este mes tiene 30 dias");
			break;
		case 12:
			System.out.print("Este mes tiene 31 dias");
			break;

		default:
			System.out.print("Este numero no coincide con ningun mes del año");
			break;
                                
                                
}
}
}