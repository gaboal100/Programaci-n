package ejercicios5_4;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int n,cont=0,suma = 0;
        System.out.println("Numero");
        n=leer.nextInt();
        suma=n;
        while(suma<10000){
            System.out.println("Numero");
            n=leer.nextInt();
            cont++;
            suma=suma+n;
        }
        System.out.println("La suma es "+suma);
        System.out.println("Has introducido "+cont+" numeros");
        System.out.println("La media es "+(suma/cont));
    }
}

