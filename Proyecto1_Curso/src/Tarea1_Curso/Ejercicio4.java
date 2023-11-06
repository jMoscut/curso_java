/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea1_Curso;

import java.util.Scanner;

/**
 *
 * @author jackiesanchez
 */
public class Ejercicio4 {
    
    //ejercicio de centigrados a farenheit
    
    
        public static void main(String[] args) {
        //sout
        
        
        Scanner sp = new Scanner(System.in);
       
    
      
       System.out.println("Ingrese el valor en centigrados para convertirlo en farenheit");
        float valor = sp.nextFloat();
 
     
        float operacion = 32 + (9 * valor/ 5 );
        
        System.out.println("En grados farenheit es: " + operacion);
        
        
        
    }
    
}
