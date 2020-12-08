package ejerciciosbucles;
public class Ejercicio1MúltiplosDe5For {
    public static void main(String[] args) {
        for (int i = 0; i<101; i++){ //El incremento de i puede ponerse i+=2,3,4,5, etc para no ir de 1 en 1
            double divisor = i%5;
            if (divisor == 0){
                System.out.println(i);
            }
        }
    }
}
