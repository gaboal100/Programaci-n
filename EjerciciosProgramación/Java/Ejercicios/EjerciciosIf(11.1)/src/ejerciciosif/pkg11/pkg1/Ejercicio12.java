package ejerciciosif.pkg11.pkg1;
import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("CUESTIONARIO");
        System.out.println("Escribe 1 o 2 para seleccionar la respuesta");
        int r1,r2,r3,r4,r5,r6,r7,r8,r9,r10;
        int nota = 0;
        System.out.println("");
        
        System.out.println("1-El 'if'...");
        System.out.println("1)Es un condicional\t 2)Sirve como un print");
        r1 = leer.nextInt();
        if (r1 == 1){
            System.out.println("Correcto");
            nota = nota + 1;
        } else{
            System.out.println("Incorrecto");            
        }
        System.out.println("");
        
        System.out.println("2-Qué es una base de datos");
        System.out.println("1)Un conjunto de datos pertenecientes a un mismo contexto y almacenados sistemáticamente para su posterior uso\t 2)Base militar");
        r1 = leer.nextInt();
        if (r1 == 1){
            System.out.println("Correcto");
            nota = nota + 1;
        } else{
            System.out.println("Incorrecto");            
        }
        System.out.println("");
        
        System.out.println("3-Las licencias de software libre...");
        System.out.println("1)Todo bajo esas licencias es gratis\t 2)Permite modificar y redistribuír");
        r1 = leer.nextInt();
        if (r1 == 2){
            System.out.println("Correcto");
            nota = nota + 1;
        } else{
            System.out.println("Incorrecto");            
        }
        System.out.println("");
        
        System.out.println("4-<p> es...");
        System.out.println("1)Una etiqueta HTML que significa párrafo\t 2)Una etiqueta de HTML que significa prioritario");
        r1 = leer.nextInt();
        if (r1 == 1){
            System.out.println("Correcto");
            nota = nota + 1;
        } else{
            System.out.println("Incorrecto");            
        }
        System.out.println("");
        
        System.out.println("5- En <body> ponemos...");
        System.out.println("1)Sólo el cuerpo de la página web\t 2)Todo");
        r1 = leer.nextInt();
        if (r1 == 1){
            System.out.println("Correcto");
            nota = nota + 1;
        } else{
            System.out.println("Incorrecto");            
        }
        System.out.println("");
        
        System.out.println("6-Java fue creado por...");
        System.out.println("1)Sun Microsystems\t 2)Microsoft");
        r1 = leer.nextInt();
        if (r1 == 1){
            System.out.println("Correcto");
            nota = nota + 1;
        } else{
            System.out.println("Incorrecto");            
        }
        System.out.println("");
        
        System.out.println("7-Git es...");
        System.out.println("1)Un controlador de versiones\t 2)CMD");
        r1 = leer.nextInt();
        if (r1 == 1){
            System.out.println("Correcto");
            nota = nota + 1;
        } else{
            System.out.println("Incorrecto");            
        }
        System.out.println("");
        
        System.out.println("8-Para qué sirve pwd");
        System.out.println("1)Muestra el directorio en el que estás\t 2)Muestra lo que hay en el directorio en el que estás");
        r1 = leer.nextInt();
        if (r1 == 1){
            System.out.println("Correcto");
            nota = nota + 1;
        } else{
            System.out.println("Incorrecto");            
        }
        System.out.println("");
        
        System.out.println("9-Un terabyte son...");
        System.out.println("1)1000 gigabytes\t 2)1000 megabytes");
        r1 = leer.nextInt();
        if (r1 == 1){
            System.out.println("Correcto");
            nota = nota + 1;
        } else{
            System.out.println("Incorrecto");            
        }
        System.out.println("");
        
        System.out.println("10-Qué es una variable");
        System.out.println("1)Un contenedor de información\t 2)Un atributo que cambia sólo y de manera autónoma");
        r1 = leer.nextInt();
        if (r1 == 1){
            System.out.println("Correcto");
            nota = nota + 1;
        } else{
            System.out.println("Incorrecto");            
        }
        System.out.println("");
        System.out.println("Nota => " + nota);
    }
}
