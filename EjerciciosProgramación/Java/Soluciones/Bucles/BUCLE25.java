package javaapplication5;

import java.util.Scanner;

public class BUCLE25 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int inv= 0;
        while (n>0){
            inv=inv*10+n%10;
            n=n/10;
        }
        System.out.println(inv);
    }
}
