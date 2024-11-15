import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero mayor a 1: ");
        int numero = scanner.nextInt();
        scanner.close();
        int primo = encontrarPrimo(numero);
        System.out.println("El número primo más cercano a " + numero + " es: " + primo);
    }
    public static int encontrarPrimo(int numero) {
        for (int i = numero; i >= 2; i--) {
            if (esPrimo(i)) {
                return i;
            }
        }
        return 2;
    }
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        boolean esPrimo = true;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                esPrimo = false;
                break; 
            }
        }
        return esPrimo; 
    }
}