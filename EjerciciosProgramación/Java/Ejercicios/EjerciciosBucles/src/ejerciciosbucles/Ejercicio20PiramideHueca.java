package ejerciciosbucles;
import java.util.Scanner;
public class Ejercicio20PiramideHueca {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dime un símbolo y la altura de la pirámide");
        String sim = leer.nextLine();
        int h = leer.nextInt();
        
        for (int i = 0; i < h; i++) {
            //Blancos externos
            for (int j = i; j < h; j++) {
                System.out.print(" ");
            }
            
            System.out.print(sim);
            for (int j = 0; j < 2 * i -1; j++) {
                System.out.print(" ");
            }
            if (i>0){
                System.out.print(sim);
            }
            
            System.out.println("");
        }
        for (int j = 0; j < 2 * h + 1; j++) {
            System.out.print(sim);
        }
        System.out.println("");
        
        /*int i = 0;
        int altura = 1;
        int espaciosInternos = 0;
        int espaciosPorDelante = h - 1;
        System.out.println("");
        
        
        
        while (altura < h){
            //Espacios delante
            for (i = 0; i <= espaciosPorDelante; i++) {
                System.out.print(" ");
            }
            
            //Línea
            System.out.print(sim);
            for (i = 1; i < espaciosInternos; i++) {
                System.out.print(" ");
            }
            
            if (altura > 1){
                System.out.print(sim);
            }
            
            System.out.println("");
            altura++;
            espaciosPorDelante--;
            espaciosInternos += 2;            
        }
        
        //base
        System.out.print(" ");
        for (i = 1; i < altura*2; i++) {
            System.out.print(sim);
        }
        System.out.println("");*/
    }
}
