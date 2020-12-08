package ejerciciosbucles;
import java.util.Scanner;
public class Ejercicio24PirámideConNúmeros {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dime la altura de la pirámide");
        int n = leer.nextInt();
        
        for (int i =0; i < n; i++){
            int cont = 0;
            
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            
            for (int j = 0; j < i*2+1; j++){
                if (j<= (i*2+1)/2){
                    cont++;
                } else{
                    cont--;
                }
                System.out.print(cont);
            }
            System.out.println("");
        }
        
        /*for (int i = 0; i < n; i++) {
            int cont = 1;
            
            for (int z = i; z < n; z++) {
                System.out.print(" ");
            }
            
            for (int j = 0; j < 2 * i + 1; j++) {
                if (j < (2*i+1)/2){
                    System.out.print(cont++);
                } else {
                    System.out.print(cont--);
                }
                
            }
            System.out.println("");
        }
        System.out.println("");*/
    }
}
