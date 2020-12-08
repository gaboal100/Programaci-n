package javaapplication4;

import java.util.Scanner;

public class ejercicio11 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Escriba el dia y el mes en que nació");
        int dia = s.nextInt();
        int mes = s.nextInt();
        switch (mes) {
            case 1:
                if (dia < 21) {
                    System.out.println("Su horóscopo es capricornio");

                }
                else{
                    System.out.println("Su horóscopo es acuario");
                }break;
            case 2: 
                if (dia<20) {
                    System.out.println("Su horóscopo es acuario");

                }
                else{
                    System.out.println("Su horóscopo es piscis");
                }break;
            case 3: 
                if (dia<20) {
                    System.out.println("Su horóscopo es piscis");

                }
                else{
                    System.out.println("Su horóscopo es aries");
                }break;
            case 4: 
                if (dia<21) {
                    System.out.println("Su horóscopo es aries");

                }
                else{
                    System.out.println("Su horóscopo es tauro");
                }break;
            case 5: 
                if (dia<22) {
                    System.out.println("Su horóscopo es tauro");

                }
                else{
                    System.out.println("Su horóscopo es geminis");
                }break;
            case 6: 
                if (dia<22) {
                    System.out.println("Su horóscopo es geminis");

                }
                else{
                    System.out.println("Su horóscopo es cáncer");
                }break;
            case 7: 
                if (dia<24) {
                    System.out.println("Su horóscopo es cancer");

                }
                else{
                    System.out.println("Su horóscopo es leo");
                }break;
            case 8: 
                if (dia<23) {
                    System.out.println("Su horóscopo es leo");

                }
                else{
                    System.out.println("Su horóscopo es virgo");
                }break;
            case 9: 
                if (dia<23) {
                    System.out.println("Su horóscopo es virgo");

                }
                else{
                    System.out.println("Su horóscopo es libra");
                }break;
            case 10: 
                if (dia<23) {
                    System.out.println("Su horóscopo es libra");

                }
                else{
                    System.out.println("Su horóscopo es escorpio");
                }break;
            case 11: 
                if (dia<23) {
                    System.out.println("Su horóscopo es escorpio");

                }
                else{
                    System.out.println("Su horóscopo es sagitario");
                }break;
            case 12: 
                if (dia<22) {
                    System.out.println("Su horóscopo es sagitario");

                }
                else{
                    System.out.println("Su horóscopo es capricornio");
                }break;

}
}
}