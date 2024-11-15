import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero; 
        do {
            System.out.println("Ingrese un número : ");
            numero = scanner.nextInt();
        } while (numero != 0);
        
        System.out.println("El número ingresado es: " + numero);
        scanner.close();
    }
}


