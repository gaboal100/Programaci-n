package ejerciciosif.pkg11.pkg1;
import java.util.Scanner;
public class Ejercicio4HorasExtras {
    public static void main(String[] args){
        Scanner leer = new Scanner (System.in);
        int hora, salario, extras;
        System.out.println("Introduce horas semanales");
        hora = leer.nextInt();
        if (hora>40) {
            extras = hora - 40;
            salario = 40*12 + extras*16;
        } else{
            salario = hora*12;
        } System.out.println("Tu salario es de " + salario + "€");
    }
}