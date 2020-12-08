package javaejerciciosrandom;
public class Ejercicio1_Tirada_de_3_dados {
    public static void main(String[] args) {
        System.out.println("Tirada de tres dados.");
        int tiradas = 0;
        int valor = 0;
        int total = 0;
        while (tiradas < 3){
            valor = (int) (Math.random()*6) + 1;
            System.out.println("Valor: " + valor);
            total += valor;
            tiradas ++;
        }
        System.out.println("");
        System.out.println("Valor total de tiradas: " + total);
    }
    
}
