package ejerciciosif.pkg11.pkg1;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dime un día (Lunes-Viernes)");
        String dia = leer.nextLine();
        switch (dia){
            case "Lunes":
            case "lunes":
            case "Miercoles":
            case "miercoles":
            case "Jueves":
            case "jueves":
                System.out.println("PROG");
                    break;
            case "Martes":
            case "martes":
            case "Viernes": 
            case "viernes":    
                System.out.println("BDAT");
                    break;
            default: System.out.println("No hay clases o has dado un dato no válido");
        }
    }
    
}
