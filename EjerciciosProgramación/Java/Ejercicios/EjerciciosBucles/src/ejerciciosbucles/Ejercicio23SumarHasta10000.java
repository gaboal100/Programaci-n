package ejerciciosbucles;
import java.util.Scanner;
public class Ejercicio23SumarHasta10000 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dame números");
        int n = leer.nextInt();
        int suma = 0;
        int contador = 0;
        while (suma <= 10000){
            System.out.println("");
            contador++;
            suma += n;
            System.out.println(suma + " Dame números");
            n = leer.nextInt();
        }
        System.out.println("");
        double media = (double) suma / (double) contador;
        System.out.println("Números introducidos => " + contador);
        System.out.println("Total acumulado = >" + suma);
        System.out.println("Media => " + media);
    }
}
