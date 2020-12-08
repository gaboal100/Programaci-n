package javaejerciciosrandom;
public class Ejercicio12_Caracteres_Aleatorios {
    public static void main(String[] args) {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            int numero = (int)(Math.random()*95)+32;
            System.out.println((char)numero);
        }
        
    }
}
