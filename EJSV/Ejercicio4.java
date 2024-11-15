import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombreUsuario = scanner.nextLine();

        System.out.print("Introduce un número entero: ");
        int numVeces = scanner.nextInt();

        for (int i = 0; i < numVeces; i++) {
            System.out.println(nombreUsuario);
        }
        scanner.close();

    }
}