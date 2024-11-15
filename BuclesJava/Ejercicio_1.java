import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una oración: ");
        String oracion = scanner.nextLine();

        String[] palabras = oracion.split(" ");
        int contador = 0;

        for (String  palabra : palabras) {

            contador++;
        }

        System.out.println("La oración contiene " + contador + " palabras.");

        scanner.close();
    }
}