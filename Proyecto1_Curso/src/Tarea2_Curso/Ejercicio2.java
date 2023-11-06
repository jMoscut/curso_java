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
public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        //declara variables
        
        int valor;
        Scanner ps = new Scanner(System.in);
        
        //ingresar un numero
        System.out.println("ingrese el valor");
        valor = ps.nextInt();
        
        //determinar si el numero es positivo, es mayor a cero, sino es negativo.
        if (valor > 0) {
            System.out.println("el numero es positivo");
        } else {
            System.out.println("el numero es negativo");
        }
    }
}
