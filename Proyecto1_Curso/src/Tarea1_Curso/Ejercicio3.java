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
public class Ejercicio3 {
   
    
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sp = new Scanner(System.in);

        // Pedir al usuario que ingrese un número
        System.out.print("Por favor, ingrese un número: ");
        int numero = sp.nextInt();

        // Calcular el doble y el triple del número
        int doble = numero * 2;
        int triple = numero * 3;

        // Mostrar los resultados en pantalla
        System.out.println("El doble de " + numero + " es: " + doble);
        System.out.println("El triple de " + numero + " es: " + triple);

       
    }
}

