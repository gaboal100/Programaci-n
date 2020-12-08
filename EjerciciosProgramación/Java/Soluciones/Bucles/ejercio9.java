
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DAM133
 */
public class ejercio9 {
    public static void main(String[] args) {
     int numeroDeDigitos = 1, n ;
    System.out.print("Introduzca un número entero y le diré cuántos dígitos tiene: ");
    Scanner Leer= new Scanner(System.in);
    n = Leer.nextInt(); 
    while (n >= 10) {
      n /= 10;
      numeroDeDigitos++;
    }
    System.out.println(n + " tiene " + numeroDeDigitos + " dígito/s.");
    }
    
}
