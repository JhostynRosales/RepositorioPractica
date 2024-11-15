import java.util.Scanner;

public class Ejercicio_raro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] frutas = new String[3][4]; 

        frutas[0][0] = "Mango";
        frutas[0][1] = "Papaya";
        frutas[0][2] = "Piña";
        frutas[0][3] = "Guanabana";

        frutas[1][0] = "Naranja";
        frutas[1][1] = "Limón";
        frutas[1][2] = "Limonero";
        frutas[1][3] = "Toronja";

        frutas[2][0] = "Fresa";
        frutas[2][1] = "Frambuesa";
        frutas[2][2] = "Arándano";
        frutas[2][3] = "Cereza";

        System.out.println("Listado de frutas: ");
        System.out.println("Tropicales: " + String.join(", ", frutas[0]));
        System.out.println("Cítricas: " + String.join(", ", frutas[1]));
        System.out.println("Bayas: " + String.join(", ", frutas[2]));

        scanner.close();
    }
}