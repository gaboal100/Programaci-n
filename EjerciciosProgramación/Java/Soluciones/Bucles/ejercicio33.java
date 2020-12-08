
package bucles;

import java.util.Scanner;


public class ejercicio33 {
    public static void main(String[] args) {
    Scanner leer=new Scanner(System.in); 
    
    System.out.print("Introduce a altura da letra U: ");
    int x=leer.nextInt();
    
    for (int i = 0; i < x-1; i++){
      
        for (int y = 1; y <= x; y++){
            
            if ((y == 1) || (y == x)){
            System.out.print("*");
            } else {
            System.out.print(" ");
            }
      }
        
        System.out.println();
    }
    
    for (int i = 1; i < x; i++){
            if ((i == 1) || (i == x)){
            System.out.print(" ");
            } else {
            System.out.print("*");
            }
       }
  }
}

