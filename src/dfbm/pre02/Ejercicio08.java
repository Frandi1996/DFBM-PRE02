/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dfbm.pre02;

import javax.swing.JOptionPane;

/**
 *
 * @author dibom
 */
public class Ejercicio08 {
    public static void main(String[] args) {
        int numero,aleatorio,contador = 0;
        
        
        aleatorio = (int) (Math.random()*100); //genero un numero aleatorio entre 0-100
        
        try{
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));
            
            
            if(aleatorio > numero){ //sentencia que se ejecuta cuando la condicion es verdadera
                System.out.println("Introduce un numero mayor");
            }
            else{ //sentencia que se ejecuta cuando la condicion es falsa
                System.out.println("Introduce un numero menor");
            }
            contador++; // Aumentamos en 1
        }while(numero != aleatorio); //mientras que la condicion es verdadera el bloque de instrucciones se ejecutara varias veces
        
        System.out.println("Has adivinado el numero en "+contador+" intentos"); // se muestra por pantalla el numero de intentos realizados en el juego
}catch(Exception e){
    System.out.println("Solo se insertan numeros");
}
}
    
}
