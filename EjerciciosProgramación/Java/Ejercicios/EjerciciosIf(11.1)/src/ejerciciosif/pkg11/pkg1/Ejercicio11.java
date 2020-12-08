package ejerciciosif.pkg11.pkg1;
import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dame horas y minutos");
        int h = leer.nextInt();
        int m = leer.nextInt();
        int medianoche = 24 * 60 *60;
        if (h > 23 || m > 59 || h < 0 || m < 0){
            System.out.println("Hora no válida");
        } else{
            h = h * 60 * 60;
            m = m * 60;
            int s = h + m;
            int paramedianoche = medianoche - s;
            System.out.println("Faltan " + paramedianoche + "s para medianoche.");
        }
        
    }
}
