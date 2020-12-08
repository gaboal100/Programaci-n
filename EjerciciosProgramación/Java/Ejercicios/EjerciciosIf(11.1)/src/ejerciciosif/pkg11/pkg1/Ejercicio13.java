package ejerciciosif.pkg11.pkg1;
import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dame tres números");
        int n1 = leer.nextInt();
        int n2 = leer.nextInt();
        int n3 = leer.nextInt();
        if (n1 > n2 && n1 > n3){
            if (n2 > n3){
                System.out.println("Orden : " + n1 + ">" + n2 + ">" + n3);
            } else{
                System.out.println("Orden : " + n1 + ">" + n3 + ">" + n2);
            }
        } else if (n2 > n1 && n2 > n3){
            if (n1 > n3){
                System.out.println("Orden : " + n2 + ">" + n1 + ">" + n3);
            } else{
                System.out.println("Orden : " + n2 + ">" + n3 + ">" + n1);
            }
        } else if (n3 > n2 && n3 > n1){
            if (n1 > n2){
                System.out.println("Orden : " + n3 + ">" + n1 + ">" + n2);
            } else{
                System.out.println("Orden : " + n3 + ">" + n2 + ">" + n1);
            }
        }
    }
    
}
