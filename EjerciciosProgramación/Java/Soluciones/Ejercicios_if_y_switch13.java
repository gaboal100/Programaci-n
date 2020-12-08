
package ejercicios_if_y_switch;

import java.util.Scanner;

public class Ejercicios_if_y_switch13 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Introduce tres núemros");
        int n1=leer.nextInt();
        int n2=leer.nextInt();
        int n3=leer.nextInt();
        if ((n1>n2) && (n2>n3)) {
            System.out.println("El orden es:"+n1+" "+n2+" "+n3);
        }
        if ((n1>n3) && (n3>n2)) {
            System.out.println("El orden es:"+n1+" "+n3+" "+n2);
        }
        if ((n2>n1) && (n1>n3)) {
            System.out.println("El orden es:"+n2+" "+n1+" "+n3);
        }
        if ((n2>n3) && (n3>n1)) {
            System.out.println("El orden es:"+n2+" "+n3+" "+n1);
        }
        if ((n3>n1) && (n1>n2)) {
            System.out.println("El orden es:"+n3+" "+n1+" "+n2);
        }
        if ((n3>n2) && (n2>n1)) {
            System.out.println("El orden es:"+n3+" "+n2+" "+n1);
        }          
    }
}
