package ejercicios5_4;

import java.util.Scanner;

public class Ejercicio_21 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int n,cont=0,media=0,mayor=0;
        System.out.println("Introduce un numero");
        n=leer.nextInt();
        while(n>0){
             System.out.println("Introduce un numero");
        n=leer.nextInt();
            if ((n>mayor) && (n%2==0)) {
                mayor=n;
            }
            if (n%2!=0) {
                cont++;
                media=media+n;
            }
        System.out.println("Introduce un numero");
        n=leer.nextInt();
        }
        System.out.println("El mayor de los pares es "+mayor+" la media de los impares es "+(media/cont));
    }
}
