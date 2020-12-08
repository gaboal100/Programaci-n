
import java.util.Scanner;


public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Dame un numero");
        int a= leer.nextInt();
        System.out.println("Dame otro numero");
        int b= leer.nextInt();
        int diga, digb, inva=0, invb=0;
        int invpar=0, invimpar=0;
        while(a>0){
            diga=a%10;
            digb=b%10;
            inva=(inva*10)+diga;
            invb=(invb*10)+digb;
            a=a/10;
            b=b/10;
        }
        while(inva>0){
            diga=inva%10;
            digb=invb%10;
            if(diga%2==0){
                invpar=(invpar*10)+diga;
            }else{
                invimpar=(invimpar*10)+diga;
            }    
            if(digb%2==0){
                invpar=(invpar*10)+digb;
            }else{
                invimpar=(invimpar*10)+digb;
            }   
            inva=inva/10;
            invb=invb/10;
        }
        System.out.println("Numero con pares "+invpar);
        System.out.println("Numero con impares "+invimpar);
    }
}
