package ejerciciosbucles;
import java.util.Scanner;
public class Ejercicio19Pirámide {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dime un símbolo y la altura de la pirámide");
        String sim = leer.nextLine();
        int h = leer.nextInt();
        System.out.println("");
        
        for (int i = 0; i < h; i++) {
            for (int z = i; z < h; z++) {
                System.out.print(" ");
            }
            
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(sim);
            }
            System.out.println("");
        }
        System.out.println("");
        
        /*
        for (int i = 1; i <= h; i++) {
            //espacios en blanco (no es necesario si se quiere un triángulo rectángulo)
            for (int blancos = 1; blancos <= h-i; blancos++) {
                System.out.print(" ");
            }
            
            //símbolo
            for (int j = 1; j <= (i*2)-1; j++) {
                System.out.print(sim);
            }
            System.out.println("");
        }*/
    }
}
