import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Introducir numero");
        int numero = sc.nextInt();
            if (numero % 15==0) {
                System.out.println("El numero es multiplo de 3 y 5");
        } else if (numero % 3 == 0) {
            System.out.println("El numero es multiplo de 3");
         } else if  (numero % 5 == 0) {
                System.out.println("El numero es multiplo de 5");
         } else {
            System.out.println("El numero no es multiplo de 3 ni 5");
            sc.close();
         } 
         }
        }
    