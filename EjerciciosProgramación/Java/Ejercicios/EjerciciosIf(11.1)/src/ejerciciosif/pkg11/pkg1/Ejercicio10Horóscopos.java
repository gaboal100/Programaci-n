package ejerciciosif.pkg11.pkg1;
import java.util.Scanner;
public class Ejercicio10Horóscopos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dime el día en el que naciste (1-31)");
        int dia = leer.nextInt();
        System.out.println("Dime el mes en el que naciste (1-12)");
        int mes = leer.nextInt();
        
        
        switch (mes){
            case 1: 
                if (dia >= 1 && dia <= 19){
                    System.out.println("Eres Capricornio");
                } else if (dia > 19 && dia <= 31){
                    System.out.println("Eres Acuario");
                } else{
                    System.out.println("Fecha Errónea");
                }
                    break;
            case 2: 
                if (dia >= 1 && dia <= 18){
                    System.out.println("Eres Acuario");
                } else if (dia > 18 && dia <= 29){
                    System.out.println("Eres Piscis");
                } else{
                    System.out.println("Fecha Errónea");
                }
                    break;
            case 3:
                if (dia >= 1 && dia <= 20){
                    System.out.println("Eres Piscis");
                } else if (dia > 20 && dia <= 31){
                    System.out.println("Eres Aries");
                } else{
                    System.out.println("Fecha Errónea");
                }
                    break;
            case 4:
                if (dia >= 1 && dia <= 20){
                    System.out.println("Eres Aries");
                } else if (dia > 20 && dia <= 30){
                    System.out.println("Eres Tauro");
                } else{
                    System.out.println("Fecha Errónea");
                }
                    break;
            case 5:
                if (dia >= 1 && dia <= 20){
                    System.out.println("Eres Tauro");
                } else if (dia > 20 && dia <= 31){
                    System.out.println("Eres Géminis");
                } else{
                    System.out.println("Fecha Errónea");
                }
                    break;
            case 6:
                if (dia >= 1 && dia <= 20){
                    System.out.println("Eres Géminis");
                } else if (dia > 20 && dia <= 30){
                    System.out.println("Eres Cáncer");
                } else{
                    System.out.println("Fecha Errónea");
                }
                    break;
            case 7:
                if (dia >= 1 && dia <= 20){
                    System.out.println("Eres Cáncer");
                } else if (dia > 20 && dia <= 31){
                    System.out.println("Eres Leo");
                } else{
                    System.out.println("Fecha Errónea");
                }
                    break;
            case 8:
                if (dia >= 1 && dia <= 21){
                    System.out.println("Eres Leo");
                } else if (dia > 21 && dia <= 31){
                    System.out.println("Eres Virgo");
                } else{
                    System.out.println("Fecha Errónea");
                }
                    break;
            case 9:
                if (dia >= 1 && dia <= 22){
                    System.out.println("Eres Virgo");
                } else if (dia > 22 && dia <= 30){
                    System.out.println("Eres Libra");
                } else{
                    System.out.println("Fecha Errónea");
                }
                    break;
            case 10:
                if (dia >= 1 && dia <= 22){
                    System.out.println("Eres Libra");
                } else if (dia > 22 && dia <= 31){
                    System.out.println("Eres Escorpio");
                } else{
                    System.out.println("Fecha Errónea");
                }
                    break;
            case 11:
                if (dia >= 1 && dia <= 22){
                    System.out.println("Eres Escorpio");
                } else if (dia > 22 && dia <= 30){
                    System.out.println("Eres Sagitario");
                } else{
                    System.out.println("Fecha Errónea");
                }
                    break;
            case 12:
                if (dia >= 1 && dia <= 20){
                    System.out.println("Eres Sagitario");
                } else if (dia > 20 && dia <= 31){
                    System.out.println("Eres Capricornio");
                } else{
                    System.out.println("Fecha Errónea");
                }
                    break;
            default: System.out.println("Erróneo");
        }
    }
}
