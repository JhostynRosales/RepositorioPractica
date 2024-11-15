import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Preguntar horas trabajadas
        System.out.println("Ingrese las horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();

        // Pregunatar salario
        System.out.println("Ingrese el salario por hora: ");
        double salarioPorHora = scanner.nextDouble();

        // Calcula el salario
        double salario = horasTrabajadas * salarioPorHora;
        System.out.println("El salario es: " + salario);
        scanner.close();
        
    }
}