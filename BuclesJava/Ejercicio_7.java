import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicite una lista de correos electrónicos
        System.out.println("Ingrese una lista de correos electrónicos separados por comas");
        String[] correos = scanner.nextLine().split(",");
        for (int i = 0; i < correos.length; i++) {
            if (!correos[i].contains("@")) {
                System.out.println("Error: El correo electrónico " + correos[i] + " no contiene el símbolo @");
                break; 
            }
        }
        System.out.println("Verificación de correos completada.");
        scanner.close();
    }
}