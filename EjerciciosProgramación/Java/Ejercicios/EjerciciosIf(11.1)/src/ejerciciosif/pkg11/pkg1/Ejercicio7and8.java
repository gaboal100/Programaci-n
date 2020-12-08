/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosif.pkg11.pkg1;
import java.util.Scanner;
public class Ejercicio7and8 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        double a, b, c;
        System.out.println("Introduce tus 3 notas separados por un espacio: ");
        a = leer.nextDouble();
        b = leer.nextDouble();
        c = leer.nextDouble();
        double rdo;
        if (a < 0 || b < 0 ||c < 0 || a > 10 ||b > 10 || c > 10){
            System.out.println("Error");
        } else{
            rdo = (a + b + c) / 3.0;
            if (rdo < 5 && rdo >= 0){
                System.out.println("Insuficiente");
            } else {
                if (rdo < 7) {
                    System.out.println("Bien");
                } else {
                    if (rdo < 9){
                        System.out.println("Notable");
                    } else {
                        if (rdo <= 10){
                            System.out.println("Sobresaliente");
                        } else{
                            System.out.println("Número no válido");
                        }
                    }
                }
            }
        }
    }
}