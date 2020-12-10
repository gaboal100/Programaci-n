package ejerciciosarray;
public class Ejercicio2_Array_de_10_Caracteres {
    public static void main(String[] args) {
        char[] simbolo = new char[12];
        simbolo[0] = 'a';
        simbolo[1] = 'x';
        simbolo[4] = '@';
        simbolo[6] = ' ';
        simbolo[7] = '+';
        simbolo[8] = 'Q';
        for (int i = 0; i < simbolo.length; i++) {
            System.out.print("/ " + simbolo[i] + " / ");
        }
        System.out.println("");
        System.out.println("Los arrays sin datos están vacíos, no son ni un espacio");
    }
}