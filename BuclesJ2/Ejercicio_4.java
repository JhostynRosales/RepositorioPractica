import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero; 
        do {
            System.out.println("Ingrese un número : ");
            numero = scanner.nextInt();
        } while (numero < 1 || numero > 10);
        
        System.out.println("El número ingresado es: " + numero);
        scanner.close();
    }
}