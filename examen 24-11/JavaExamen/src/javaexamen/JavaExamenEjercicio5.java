package javaexamen;
import java.util.Scanner;
public class JavaExamenEjercicio5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dime cuántos alumnos");
        int num = leer.nextInt();
        double h, p, imc;
        int pesos = 0, bajopeso = 0, saludable = 0, sobrepeso = 0, obeso = 0, obesoex = 0;
        double n = 0.00, estaturas = 0.00;
        
        for (int i = 0; i < num; i++) {
            System.out.println("Dame la altura");
            h = leer.nextDouble();
            estaturas += h;
            n++;

            System.out.println("Dame el peso");
            p = leer.nextDouble();
            
            imc=p/h*h;
            
            if(imc<10.5){
                bajopeso++;
            } else if(imc<25.00){
                saludable++;
            } else if(imc < 30.00){
                sobrepeso++;
            } else if(imc < 40.00){
                obeso++;
            } else if(imc >= 40.00){
                obesoex++;
            }                       
        }
        System.out.println("Altura media => " + (estaturas/n));
        System.out.println("Con bajo peso: " + bajopeso);
        System.out.println("Saludables: " + saludable);
        System.out.println("Con sobrepeso: " + sobrepeso);
        System.out.println("Obesos: " + obeso);
        System.out.println("Obesos extremos: " + obesoex);
    }
}
