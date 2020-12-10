package ejerciciosarrays;
public class Ejercicio10_Ordenar_Pares_e_Impares {
    public static void main(String[] args) {
        int[] n = new int[20];
        int[] aux = new int[20];
        int contpar = 0;
        
        for (int i = 0; i < n.length; i++) {
            n[i] = (int) (Math.random() * 101);
            System.out.print(n[i] + " ");
        }
        
        System.out.println("");
        for (int i = 0; i < n.length; i++) {
            System.out.print("===");
        }
        System.out.println("");
        
        for (int i = 0; i < n.length; i++) {
            if(n[i]%2==0){
                aux[contpar]=n[i];
                contpar++;
            }
        }
        
        for (int i = 0; i < aux.length; i++) {
            if(n[i]%2!=0){
                aux[contpar]=n[i];
                contpar++;
            }
        }
        
        for (int i = 0; i < aux.length; i++) {
            System.out.print(aux[i] + " ");
        }
        
    }
}
