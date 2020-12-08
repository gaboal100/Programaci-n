package javaejerciciosrandom;
public class Ejercicio15_Generador_Melodía {
    public static void main(String[] args) {
        int compas = 4 * ((int)(Math.random()*7)+1);
        int nota;
        String primeraNota = "";
        for (int i = 1; i <= compas; i++) {
            nota = (int)(Math.random()*7)+1;
            switch(nota){
                case 1:
                    System.out.print("Do");
                    break;
                case 2:
                    System.out.print("Re");
                    break;
                case 3:
                    System.out.print("Mi");
                    break;
                case 4:
                    System.out.print("Fa");
                    break;
                case 5:
                    System.out.print("Sol");
                    break;
                case 6:
                    System.out.print("La");
                    break;
                case 7:
                    System.out.print("Si");
                    break;
            }
            System.out.print(" ");
            
            if (i%4 == 0){
                System.out.print(" | ");
            }
        }
    }
}
