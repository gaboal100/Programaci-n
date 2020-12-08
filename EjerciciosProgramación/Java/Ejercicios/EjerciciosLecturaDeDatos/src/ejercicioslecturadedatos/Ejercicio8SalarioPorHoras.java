package ejercicioslecturadedatos;
import java.util.Scanner;
public class Ejercicio8SalarioPorHoras {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dame las horas trabajadas");
        double horas = leer.nextDouble();
        double salario = horas * 12;
        System.out.println("Te debemos " + salario + "€");
    }
}
