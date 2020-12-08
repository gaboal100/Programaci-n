package ejerciciosbucles;
import java.util.Scanner;
public class Ejercicio7CajaFuerte {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Contraseña de la caja fuerte");
        /*int a;
        int b=1;
        do{
            System.out.println("Introduce un código");
            a = leer.nextInt();
            b++;
        } while (a != 1234 && b <= 4);
        if (a == 1234){
            System.out.println("Código correcto");
        } else{
            System.out.println("Código incorrecto");
        }
        */
        
        for (int i = 0; i < 4; i++){
            int contraseña = leer.nextInt();
            if (contraseña != 1234){
                System.out.println("Lo siento, esa no es la combinación");
            } else{
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                break;
            }
        }
    }
}
