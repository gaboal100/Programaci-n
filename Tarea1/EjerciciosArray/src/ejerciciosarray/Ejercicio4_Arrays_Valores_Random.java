package ejerciciosarray;
public class Ejercicio4_Arrays_Valores_Random {
    public static void main(String[] args) {
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];
        
        for (int i = 0; i < numero.length; i++) {
            numero[i] = (int) (Math.random()*100);
        }
        
        for (int i = 0; i < cuadrado.length; i++) {
            cuadrado[i] = (int) Math.pow(numero[i], 2); 
        }
        
        for (int i = 0; i < cubo.length; i++) {
            cubo[i] = (int) Math.pow(numero[i], 3); 
        }
        
        System.out.println("");
        System.out.println("Número\t\tCuadrado\tCubo");
        for (int i = 0; i < cubo.length; i++) {
            System.out.println(numero[i] + "\t\t" + cuadrado[i] + "\t\t" + cubo[i]);
        }
    }
}
