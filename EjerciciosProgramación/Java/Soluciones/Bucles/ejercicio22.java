
import java.util.Scanner;
public class ejercicio22 {
    public static void main(String[] args) {
        for (int n = 2; n <= 100; n++) {
            int i=2;
            while (n%i!=0 && i<=n/2){
                i++;
            }
            if (i>n/2){
                System.out.println(n);
            }
            
                  
            
           
        }
            
        
        
        
    }
    
    
}
