
package ejercicios_condicional;

import java.util.Scanner;

public class ejercicio_3 {
    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
    int x;
    System.out.println("Escribe un número entre el 1 y el 7");
    x= leer.nextInt();
    
    switch  (x){
        case 1: System.out.println("lunes"); break;
        case 2: System.out.println ("martes"); break;
        case 3: System.out.println("miercoles"); break;
        case 4: System.out.println("jueves"); break;
        case 5: System.out.println("viernes"); break;
        case 6: System.out.println("sábado"); break;
        case 7: System.out.println("domingo"); break;
        default : System.out.println("día erróneo");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
}