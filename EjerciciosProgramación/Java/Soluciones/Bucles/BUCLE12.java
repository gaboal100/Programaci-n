package javaapplication5;

import java.util.Scanner;

public class BUCLE12 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.print("Escriba cuantos términos quiere calcular de la sucesión de fibonacci");
        int n= s.nextInt();
        int x=0;
        int y=1;
        int suma=0;
        System.out.print(x + ", " + y);
        for(int i=0; i<n; i++){
            suma=x+y;
            System.out.print(", " + suma);
            x=y;
            y=suma;
            
        }System.out.println("10");
    }

}
