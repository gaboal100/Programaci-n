package javatarea;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dame un número");
        int n = leer.nextInt();
        int cont = 0;
        System.out.print("Secuencia => " + "/" + n + "/ ");
        while (n!=1){
            if(n%2==0){
                n=n/2;
            }else{
                n=n*3+1;
            }
            cont++;
            System.out.print("/" + n + "/ ");
        }
        System.out.println("");
        System.out.println("Número de ciclos: " + cont);
    }
}
