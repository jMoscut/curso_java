/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea2_Curso;

import java.util.Scanner;

/**
 *
 * @author jackiesanchez
 */
public class Ejercicio4 {
    
     public static void main(String[] args) {
         
         //declarar variables
        int v1, v2, v3;
        
        Scanner ps = new Scanner(System.in);
        
        //requerir valores
        System.out.println("Ingrese el primer numero"); //n
        v1 = ps.nextInt();
        System.out.println("Ingrese el segundo numero"); //m
        v2 = ps.nextInt();
        System.out.println("Ingrese el tercer numero");//p
        v3 = ps.nextInt();
        
        
        //determinar el orden de los números
        
        if (v1 > v2 && v1 > v3 && v2 > v3) {
            System.out.println("El orden es el siguiente: " + v1 + ", " + v2 + " y " + v3);
        } else if (v2 > v1 && v2 > v3 && v1 > v3) {
            System.out.println("El orden es el siguiente: " + v2 + ", " + v1 + " y " + v3);
        } else if (v3 > v2 && v3 > v1 && v2 > v1) {
            System.out.println("El orden es el siguiente: " + v3 + ", " + v2 + " y " + v1);
        } else if (v2 > v1 && v2 > v3 && v3 > v1) {
            System.out.println("El orden es el siguiente: " + v2 + ", " + v3 + " y " + v1);
        } else if (v3 > v2 && v3 > v1 && v1 > v2) {
            System.out.println("El orden es el siguiente: " + v3 + ", " + v1 + " y " + v2);
        } else if (v1 > v2 && v1 > v3 && v3 > v2) {
            System.out.println("El orden es el siguiente: " + v1 + ", " + v3 + " y " + v2);
        }
    }
    
}
