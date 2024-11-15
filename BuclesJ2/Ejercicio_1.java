import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Ingrese un número entero y positivo: ");
        int numero = scanner.nextInt();
        //calcular facotrial con bucle while
        int factorial = 1;
        while (numero > 1) {
            factorial *= numero;
            numero--;
            }
            scanner.close();
            System.out.println("El factorial del número ingresado es: " + factorial);
        }
    }