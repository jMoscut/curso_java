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
public class Ejercicio3 {
    
    
    public static void main(String[] args) {
        
        //declara variables
        int valor1, valor2;
        Scanner ps = new Scanner(System.in);
        
        //ingresar valores 
        System.out.println("ingrese el primer valor");
        valor1 = ps.nextInt();
        System.out.println("ingrese el segundo valor");
        valor2 = ps.nextInt();
        
        //determinar si el valor1 es mayor, si lo es mostrar primero para ir en orden, sino mostrar valor2 primero
        if (valor1 > valor2) {
            System.out.println("Los numeros van en el siguiente orden:  " + valor1 + " y " + valor2);
        } else {
            System.out.println("Los numeros van en el siguiente orden: " + valor2 + " y " + valor1);
        }
    }
}
