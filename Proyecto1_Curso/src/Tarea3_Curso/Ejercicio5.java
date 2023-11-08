/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea3_Curso;

/**
 *
 * @author jackiesanchez
 */
public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        String asterisco = "*";
        
        
        for(int i=1 ; i<= 10; i +=1 ){
            
            StringBuilder result = new StringBuilder(); 
           for( int j=1 ; j<=i ; j +=1){
               result.append(asterisco);
               
           } 
         System.out.println(result);
        }
        
        }
    }
    

