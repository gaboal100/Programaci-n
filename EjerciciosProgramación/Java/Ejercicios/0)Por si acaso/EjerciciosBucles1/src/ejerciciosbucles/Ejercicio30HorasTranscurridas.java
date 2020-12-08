package ejerciciosbucles;
import java.util.Scanner;
public class Ejercicio30HorasTranscurridas {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor, introduzca el día");
        int dia = leer.nextInt();
        System.out.println("Por favor, ingrese la hora");
        int hora = leer.nextInt();
        int dia2;
        
        do{
            System.out.println("Por favor, introduzca el día (tiene que ser posterior al primero)");
            dia2 = leer.nextInt();
        } while(dia2 < dia);   
        System.out.println("Por favor ingrese la hora");
        int hora2 = leer.nextInt();
        
        //Días entre día 1 y día 2
        int entreDias = dia2 - dia;
        int entreHoras = entreDias * 24;
        int horas = entreHoras - (hora - hora2);
        System.out.println("Horas transcurridas = " + horas);
    }
}
