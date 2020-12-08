package javaexamen;
import java.util.Scanner;
public class JavaExamenEjercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a,b, mayor, menor, resto;
        do{
            System.out.println("Introduce 2 números");
            a=leer.nextInt();
            b=leer.nextInt();
        } while(a<=0 && b<=0);
        if(a>b){
            mayor = a;
            menor = b;
        }else{
            mayor = b;
            menor = a;
        }
        System.out.println("");
        
        do{
            resto = mayor%menor;
            System.out.println(mayor+"/"+menor+" \\/\\/ Resto=>"+resto);
            mayor = menor;
            menor = resto;
        } while(resto != 0);
        
        System.out.println("MCD => " + mayor);
    }    
}
