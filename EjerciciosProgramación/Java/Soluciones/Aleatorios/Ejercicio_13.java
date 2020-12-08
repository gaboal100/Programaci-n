
package ejerciciosmathrandom;
/*Ejercicio página 59*/

public class Ejercicio_13 {
    public static void main(String[] args) {
        int a;
        int b;
        do {
            a=(int)(Math.random()*6)+1;
            b=(int)(Math.random()*6)+1;
            System.out.println("El primer dado ha dado: "+ a);
            System.out.println("El segundo dado ha dado: "+ b);
        } while (a!=b);
          
    }
}
