package dfbm.pre02;

import java.util.Scanner;
/**
 *
 * @author dibom
 */
public class Ejercicio03 {
     public static void main(String[] args) {
         
         
         Scanner sc = new Scanner(System.in);
         try{
	int lectura;//inicio variable lectura
	System.out.print("Introduzca el numero del mes del que quiere conocer los dias: \n"); //declaro esta variable para lanzar por pantalla el texto entre parentesis
	
        System.out.println("1.Enero");//declaro esta variable para lanzar por pantalla el texto entre parentesis con salto de linea
        System.out.println("2.Febrero");//declaro esta variable para lanzar por pantalla el texto entre parentesis con salto de linea
        System.out.println("3.Marzo");//declaro esta variable para lanzar por pantalla el texto entre parentesis con salto de linea
        System.out.println("4.Abril");//declaro esta variable para lanzar por pantalla el texto entre parentesis con salto de linea
        System.out.println("5.Mayo");//declaro esta variable para lanzar por pantalla el texto entre parentesis con salto de linea
        System.out.println("6.Junio");//declaro esta variable para lanzar por pantalla el texto entre parentesis con salto de linea
        System.out.println("7.Julio");//declaro esta variable para lanzar por pantalla el texto entre parentesis con salto de linea
        System.out.println("8.Agosto");//declaro esta variable para lanzar por pantalla el texto entre parentesis con salto de linea
        System.out.println("9.Septiembre");//declaro esta variable para lanzar por pantalla el texto entre parentesis con salto de linea//declaro esta variable para lanzar por pantalla el texto entre parentesis con salto de linea//declaro esta variable para lanzar por pantalla el texto entre parentesis con salto de linea
        System.out.println("10.Octubre");//declaro esta variable para lanzar por pantalla el texto entre parentesis con salto de linea
        System.out.println("11.Noviembre");//declaro esta variable para lanzar por pantalla el texto entre parentesis con salto de linea
        System.out.println("12.Diciembre");//declaro esta variable para lanzar por pantalla el texto entre parentesis con salto de linea
	lectura = sc.nextInt(); 
        

switch(lectura) //estructura de control
     {           
            
    
        
     		case 1:
                    System.out.print("Este mes tiene 31 dias");
			break; //rompe la iteracción del bucle
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

		
}
        }catch(Exception e){
        System.out.println("Insertar solo numero de mes de 1 a 12");
         }
     }
}


                                
                                


