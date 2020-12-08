package ejercicios5_4;
import java.util.Scanner;
public class ejercicios5_4_13 {
    public static void main(String[] args) {
    int C1=0;
    int C2=0;
    int n;
    Scanner leer=new Scanner(System.in);
    for (int i = 0; i < 10; i++) {
        System.out.println("Dame 1 numero positivo o negativo");
        n=leer.nextInt();
        if (n>0){
            C1++;
        } else {
            C2++;
        }
    }
        System.out.println("Numero de positivos= "+C1+"\n Numero de negativos= "+C2);
    }
           
}
