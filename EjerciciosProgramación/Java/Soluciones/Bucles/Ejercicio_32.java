/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosbucles;

import java.util.Scanner;

/**
 *
 * @author dam121
 */
public class Ejercicio_32 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Introduzca un numero");
        long a=leer.nextLong();
        long b=0;
        int longitud= 0;
        int contpares=0;
                
        
        if (a==0) {
            longitud= 1;
        }
        
        while (a> 0) {
            b= (b*10) + (a%10);
            
            if ((a%10)%2==0)
                contpares+=(a%10);
            a/=10;
        }    
        while (b>0){
          if((b%10)%2==0) {
              System.out.println("Son digitos pares: " + (b%10));
          }
          b=b/10;
        }
        System.out.println("La suma es: " + contpares);
    }
  
}
