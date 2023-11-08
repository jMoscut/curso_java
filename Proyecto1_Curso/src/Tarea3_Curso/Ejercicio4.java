/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea3_Curso;

/**
 *
 * @author jackiesanchez
 */
public class Ejercicio4 {
    
     public static void main(String[] args) {
        
         int numero = 1;
         
         
         
        while (numero <= 10) {
            System.out.println("Tabla de multiplicar del " + numero + ":");
            
              int multiplicador = 1;
              
            while (multiplicador <= 10) {
                int resultado = numero * multiplicador;
                System.out.println(numero + " x " + multiplicador + " = " + resultado);
                multiplicador++;
            }
            
            numero++;
            
        }
    }
}
