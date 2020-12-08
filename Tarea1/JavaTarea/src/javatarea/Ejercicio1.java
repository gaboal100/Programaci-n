package javatarea;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        String bin = "";
        int inv = 0;
        do{
            System.out.println("Dame un número en base decimal positivo entre 0 y 9999");
            num = leer.nextInt();
        }while(num < 0 || num > 9999);
        
        while(num>0){
            int resto = num%2;
            bin = resto + bin;
            num /= 2;
        }
        System.out.println("Binario = " + bin);
    }
    
}
