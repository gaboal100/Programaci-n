/*Ejercicio de variables 1
 */
package ejerciciosvariables;
public class EjerciciosVariables {
    public static void main(String[] args) {
        int x = 144, y = 999;
        int suma = x + y;
        int resta = x - y;
        int resta2 = y - x;
        float division = (float)x / (float)y;
        float division2 = (float)y / (float)x;
        int multiplicacion = x * y;
        
        System.out.println("x = " + x + "\ty = " + y);
        System.out.println(x + " + " + y +" = " + suma);
        System.out.println(x + " - " + y +" = " + resta);
        System.out.println(y + " - " + x +" = " + resta2);
        System.out.println(x + " / " + y +" = " + division);
        System.out.println(y + " / " + x +" = " + division2);
        System.out.println(x + " * " + y +" = " + multiplicacion);
        
    }
    
}
