package javaejerciciosrandom;
public class Ejercicio13_Tirada_de_2_dados {
    public static void main(String[] args) {
        int dado1;
        int dado2;
        do{
            dado1 = (int) (Math.random()*6)+1;
            dado2 = (int) (Math.random()*6)+1;
            System.out.println("Resultados: " + dado1 + "\t" + dado2);
        } while(dado1 != dado2);
    }
}
