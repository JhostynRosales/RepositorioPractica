import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu nombre : ");
        String name = scanner.nextLine();
        scanner.close();

        System.out.println(name.toUpperCase() + " tiene " + name.length() + " letras");
        }
    }

