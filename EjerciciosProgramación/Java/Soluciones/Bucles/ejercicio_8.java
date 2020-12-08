
package ejercicios_5.pkg4;

import java.util.Scanner;

public class ejercicio_8 {
    public static void main(String[] args) {
        System.out.println("dame un numero para realizar la tabla");
        Scanner esc=new Scanner(System.in);
        int a=esc.nextInt();
        int res;
        for (int b=0;b<=10;b++){
            res=a*b;
            System.out.println(a+"x"+b+"="+res);
        }
    
    
    }
}
