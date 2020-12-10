package aceptaelreto;
import java.util.Scanner;
public class Ejercicio155 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int x, y, p;
        while(true){
            x = leer.nextInt();
            y = leer.nextInt();
            p = x*2 + y*2;
                if (x<0 || y <0) {
                    break;
                }
            System.out.println(p);
        }
    }
}
