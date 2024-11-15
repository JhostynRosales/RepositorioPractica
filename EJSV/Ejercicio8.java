import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un entero positivo: ");
        int n = scanner.nextInt();
        int suma = 0;

        for (int i = 1; i <= n; i++) {

            suma += i;
        }

        System.out.println("La suma de enteros desde 1 hasta " + n + " es: " + suma);
        scanner.close();
    }
}