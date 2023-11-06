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
public class Ejercicio5 {
    
        public static void main(String[] args) {
        //sout
        
        
        Scanner sp = new Scanner(System.in);
       
    
       System.out.println("Calcular area y longitud de un circulo");
       System.out.println("Ingrese el radio");
        float valor = sp.nextFloat();
       
           float longitud = 2 * 3.14f * valor; // Usamos "f" para indicar que 3.14 es un float
           float area = 3.14f * valor * valor; // Corregimos la fórmula para calcular el área
        
        System.out.println("El área es: " + area + " y la longitud es: " + longitud);
        
        
        
    }
}
