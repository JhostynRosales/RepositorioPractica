import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        //determinar si un numero es par o impar
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = sc.nextInt();
        if (numero % 2 != 0) {
            System.out.println("El numero es impar");
            } else if(numero == 0 ){
                System.out.println("El numero es cero");
         } else {
                System.out.println("El numero es par");
                sc.close();
         }
        }
    }     
        



