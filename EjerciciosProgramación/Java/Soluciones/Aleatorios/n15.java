package ejerciciosnumerosaleatorios;
public class n15 {
    public static void main(String[] args) {
        int notas = 4*((int)(Math.random()*7)+1);
        int nota;
        String primeraNota = "";
        for (int contadorNota =1; contadorNota <= notas; contadorNota++) {
        nota =(int) (Math.random()*7)+1;
        switch (nota){
            case 1:
                System.out.print("do ");
                break;
            case 2:
                System.out.print("re ");
                break;
            case 3:
                System.out.print("mi ");
                break;
            case 4:
                System.out.print("fa ");
                break;
            case 5:
                System.out.print("sol ");
                break;
            case 6:
                System.out.print("la ");
                break;
            case 7:
                System.out.print("si ");
                break;
        }
        if (contadorNota%4==0&&(contadorNota>=4)){
            System.out.print(" | ");   
        }    
        }
    }
}
