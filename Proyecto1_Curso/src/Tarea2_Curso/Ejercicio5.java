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
public class Ejercicio5 {
    
        public static void main(String[] args) {
            
            
        Scanner ps = new Scanner(System.in);
        
        //declarar variables
        int dd, mm, yy;
        
        
        //se requieren los datos al usuario
        
        System.out.println("Ingrese el dia");
        dd = ps.nextInt();
        System.out.println("Ingrese el mes");
        mm = ps.nextInt();
        System.out.println("Ingrese el año");
        yy = ps.nextInt();
        
        //definir el mes en que se esta 
        if (mm > 0 && mm <= 12) {
            
            //una vez definido el mes, limitar los días correspondientes a cada mes y mostrar en pantalla el mes en que se esta
            //y el día exacto según la fecha que ingreso, si no cumple se mostrará un error.
            switch (mm) {
                case 1:
                    if (dd > 0 && dd <= 31) {
                        System.out.println("Enero");
                        System.out.println("El día es: " + dd + "/" + mm + "/" + yy);
                    } else {
                        System.out.println("La fecha ha sido ingresada incorrectamente");
                    }
                    break;
                case 2:
                    if (dd > 0 && dd <= 31) {
                        System.out.println("Febrero");
                        System.out.println("El día es: " + dd + "/" + mm + "/" + yy);
                    } else {
                        System.out.println("La fecha ha sido ingresada incorrectamente");
                    }
                    break;
                case 3:
                    if (dd > 0 && dd <= 31) {
                        System.out.println("Marzo");
                        System.out.println("El día es: " + dd + "/" + mm + "/" + yy);
                    } else {
                        System.out.println("La fecha ha sido ingresada incorrectamente");
                    }
                    break;
                case 4:
                    if (dd > 0 && dd <= 31) {
                        System.out.println("Abril");
                        System.out.println("El día es: " + dd + "/" + mm + "/" + yy);
                    } else {
                        System.out.println("La fecha ha sido ingresada incorrectamente");
                    }
                    break;
                case 5:
                    if (dd > 0 && dd <= 31) {
                        System.out.println("Mayo");
                        System.out.println("El día es: " + dd + "/" + mm + "/" + yy);
                    } else {
                        System.out.println("La fecha ha sido ingresada incorrectamente");
                    }
                    break;
                case 6:
                    if (dd > 0 && dd <= 31) {
                        System.out.println("Junio");
                        System.out.println("El día es: " + dd + "/" + mm + "/" + yy);
                    } else {
                        System.out.println("La fecha ha sido ingresada incorrectamente");
                    }
                    break;
                case 7:
                    if (dd > 0 && dd <= 31) {
                        System.out.println("Julio");
                        System.out.println("El día es: " + dd + "/" + mm + "/" + yy);
                    } else {
                        System.out.println("La fecha ha sido ingresada incorrectamente");
                    }
                    break;
                case 8:
                    if (dd > 0 && dd <= 31) {
                        System.out.println("Agosto");
                        System.out.println("El día es: " + dd + "/" + mm + "/" + yy);
                    } else {
                        System.out.println("La fecha ha sido ingresada incorrectamente");
                    }
                    break;
                case 9:
                    if (dd > 0 && dd <= 31) {
                        System.out.println("Septiembre");
                        System.out.println("El día es: " + dd + "/" + mm + "/" + yy);
                    } else {
                        System.out.println("La fecha ha sido ingresada incorrectamente");
                    }
                    break;
                case 10:
                    if (dd > 0 && dd <= 31) {
                        System.out.println("Octubre");
                        System.out.println("El día es: " + dd + "/" + mm + "/" + yy);
                    } else {
                        System.out.println("La fecha ha sido ingresada incorrectamente");
                    }
                    break;
                case 11:
                    if (dd > 0 && dd <= 31) {
                        System.out.println("Noviembre");
                        System.out.println("El día es: " + dd + "/" + mm + "/" + yy);
                    } else {
                        System.out.println("La fecha ha sido ingresada incorrectamente");
                    }
                    break;
                case 12:
                    if (dd > 0 && dd <= 31) {
                        System.out.println("Diciembre");
                        System.out.println("El día es: " + dd + "/" + mm + "/" + yy);
                    } else {
                        System.out.println("La fecha ha sido ingresada incorrectamente");
                    }
                    break;
            }
        } else {
            System.out.println("EL mes ha sido ingresado incorrectamente");
        }
    }
    
}
