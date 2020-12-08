/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosif.pkg11.pkg1;
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        double a,b,c;
        System.out.println("Introduce tres valores para resolver la ecuación");
        a = leer.nextDouble();
        b = leer.nextDouble();
        c = leer.nextDouble();
        double calc1 = (Math.pow(b,2)) - (4*a*c);
        if (calc1 >= 0){
            double x1 = (-b + Math.sqrt(calc1)) / (2*a);
            double x2 = (-b - Math.sqrt(calc1)) / (2*a);
            System.out.println("X1 = " + x1 + "// X2 = " + x2);
        } else{
            System.out.println("No hay solución");
        }
    }
}