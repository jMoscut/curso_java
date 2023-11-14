/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea4_Curso;

import java.util.Scanner;

/**
 *
 * @author jackiesanchez
 */
public class Ejercicio_Bancario {
    
      private double saldoc1;
    private double saldoc2;

    public Ejercicio_Bancario(double saldoi1, double saldoi2) {
        
        saldoc1 = saldoi1;
        saldoc2 = saldoi2;
    }

    public void depositar(int cuenta, double monto) {
          switch (cuenta) {
              case 1 -> {
                  saldoc1 += monto;
                  System.out.println("Depósito en Q." + monto + " realizado en la primera cuenta.");
              }
              case 2 -> {
                  saldoc2 += monto;
                  System.out.println("Depósito en Q." + monto + " realizado en la segunda cuenta.");
              }
              default -> System.out.println("Cuenta no válida.");
          }
    }

    public void consultarSaldos() {
        System.out.println("Saldo de la primera cuenta: Q." + saldoc1);
        System.out.println("Saldo de la segunda cuenta: Q." + saldoc2);
    }

    public void debitar(int cuenta, double monto) {
          switch (cuenta) {
              case 1:
                  if (saldoc1 >= monto) {
                      saldoc1 -= monto;
                      System.out.println("Retiro en Q." + monto + " realizado a la primera cuenta.");
                  } else {
                      System.out.println("Saldo insuficiente en la cuenta.");
                  }     break;
              case 2:
                  if (saldoc2 >= monto) {
                      saldoc2 -= monto;
                      System.out.println("Retiro de Q." + monto + " realizado a la segunda cuenta.");
                  } else {
                      System.out.println("Saldo insuficiente en la cuenta.");
                  }     break;
              default:
                  System.out.println("Cuenta no válida.");
                  break;
          }
    }
    
        public static void main(String[] args) {
            Scanner sp = new Scanner(System.in);
            double saldoi1 = 1000.0;
            double saldoi2 = 2000.0;
            Ejercicio_Bancario cuenta = new Ejercicio_Bancario(saldoi1, saldoi2);

            int opcion;

            do {
                System.out.println("1. Depositar");
                System.out.println("2. Debitar");
                System.out.println("3. Consultar saldos");
                System.out.println("4. Salir");
                System.out.print("Elija una opción: ");
                opcion = sp.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el número de cuenta: ");
                        int cuentaDeposito = sp.nextInt();
                        System.out.print("Ingrese el monto a depositar: ");
                        double montoDeposito = sp.nextDouble();
                        cuenta.depositar(cuentaDeposito, montoDeposito);
                        break;

                    case 2:
                        System.out.print("Ingrese el número de cuenta: ");
                        int cuentaRetiro = sp.nextInt();
                        System.out.print("Ingrese el monto a retirar: ");
                        double montoRetiro = sp.nextDouble();
                        cuenta.debitar(cuentaRetiro, montoRetiro);
                        break;

                    case 3:
                        cuenta.consultarSaldos();
                        break;

                    case 4:
                        System.out.println("Gracias por utilizar el servicio");
                        break;

                    default:
                        System.out.println("Intente de nuevo.");
                }

            } while (opcion != 4);
        }
    
    
}
