package javaejerciciosrandom;
public class Ejercicio11_20_notas {
    public static void main(String[] args) {
        int contsuspenso = 0;
        int contsuficiente = 0;
        int contbien = 0;
        int contnotable = 0;
        int contsobresaliente = 0;
        for (int i = 0; i < 20; i++) {
            int nota = (int) (Math.random()*11);
            System.out.print(nota);
            if (nota < 5){
                System.out.print(": suspenso.");
                contsuspenso++;
            } else if (nota == 5){
                System.out.print(": suficiente.");
                contsuficiente++;
            } else if (nota == 6){
                System.out.print(": bien.");
                contbien++;
            } else if (nota == 7 || nota == 8){
                System.out.print(": notable.");
                contnotable++;
            } else if (nota > 8 && nota <=10){
                System.out.print(": sobresaliente.");
                contsobresaliente++;
            }
            System.out.println("");
        }
        System.out.println("Suspensos: " + contsuspenso);
        System.out.println("Suficientes: " + contsuficiente);
        System.out.println("Bienes: " + contbien);
        System.out.println("Notables: " + contnotable);
        System.out.println("Sobresalientes: " + contsobresaliente);
    }
}
