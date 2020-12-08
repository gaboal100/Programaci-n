package ejerciciosbucles;
import java.util.Scanner;
public class Ejercicio21CotarNúmeros {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dame un número. Se para cuando me das un número negativo: ");
        int num = leer.nextInt();
        int aux = 0;
        int contador = 0;
        int contaimpar = 0;
        int suma = 0;
        while(num >= 0){
            System.out.println("");
            if (num%2 == 0){
                if (num > aux){
                    aux = num;
                }
            }else{
                suma += num;
                contaimpar++;
            }
            contador++;
            System.out.println("Dame un número. Se para cuando me das un número negativo: ");
            num = leer.nextInt();
        }
        double media = ((double)suma / (double)contaimpar);
        
        System.out.println("Cantidad de números introducidos => " + contador);
        System.out.println("El mayor de los pares es => " + aux);
        System.out.println("La media de los impares es => " + media);
    }
}
