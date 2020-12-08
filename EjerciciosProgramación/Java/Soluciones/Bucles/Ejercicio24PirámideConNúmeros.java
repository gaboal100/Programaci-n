
import java.util.Scanner;
public class Ejercicio5_24 {
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
        
        
    }
}
