package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
            int horas, sueldo=0;
            System.out.println("¿Cuantas horas ha trabajado?");
            horas= leer.nextInt();
            if (horas>40){
                sueldo=40*12+(horas-40)*16;
            }
            else if(horas>0) {    
              sueldo=horas*12;
            }else{
                System.out.println("Horas erroneas");
            }
            System.out.println("El sueldo es: "+sueldo);
            }
}
