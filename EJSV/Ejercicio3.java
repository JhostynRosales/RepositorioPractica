import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Preguntar nombre del usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("¡Hola, " + nombre + "!");
        scanner.close();
    }
}