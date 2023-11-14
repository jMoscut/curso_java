/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosEnClase;

import java.util.Scanner;

/**
 *
 * @author jackiesanchez
 */
public class EjercicioEnClase1 {
    
    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);

        int[][] matriz = new int[3][5];

        System.out.println("Ingrese 15 valores numéricos:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (sp.hasNextInt()) {
                    matriz[i][j] = sp.nextInt();
                } else {
                    System.out.println("Por favor, ingrese un valor numérico válido.");
                    sp.next(); // Limpiar la entrada no válida
                    j--; // Repetir el mismo índice de columna
                }
            }
        }

        System.out.println("Matriz resultante de 3x5:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

    
