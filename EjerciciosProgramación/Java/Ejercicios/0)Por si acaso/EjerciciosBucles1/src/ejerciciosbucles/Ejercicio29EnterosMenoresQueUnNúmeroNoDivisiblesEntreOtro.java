package ejerciciosbucles;
import java.util.Scanner;
public class Ejercicio29EnterosMenoresQueUnNúmeroNoDivisiblesEntreOtro {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dame un número");
        int n1 = leer.nextInt();
        System.out.println("Dame un número para buscar sus no divisores");
        int n2 = leer.nextInt();
        System.out.println("");
        
        for (int i = n1-1; i > 0; i--) {
            if (i%n2 != 0){
                System.out.print("/" + i + "/ ");
            }
        }
        
    }
}
