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
public class Ejercicio1 {
    
    
    public static void main(String[] args) {
        
        //declarar variables
        
        int numero1, numero2;
        
        //pide los valores
        
        Scanner ps = new Scanner(System.in);
        System.out.println("ingrese el primer valor");
        numero1 = ps.nextInt();
        System.out.println("ingrese el segundo valor");
        numero2 = ps.nextInt();
        
        //determina si son iguales
        if (numero1 == numero2) {
            System.out.println("los numeros ingresados son iguales");
        } else {
            System.out.println("los numeros ingresados son diferentes");
        }
    }
}
