package ejerciciosbucles;
public class Ejercicio22NúmerosPrimosEntre2y100 {
    public static void main(String[] args) {
        for (int n = 2; n <= 100; n++) {
            int contador = 2;
            while (n % contador != 0 && contador <= n/2){
                contador++;
            }
            if (contador > n/2){
                System.out.println(n);
            }
        }
    }
}
