import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // lee la cantidad de dinero depositada en la cuenta de ahorros, introducida por el usuario.
        System.out.println("Introduce la cantidad de dinero depositada en la cuenta de ahorros:");
        int ahorros = scanner.nextInt();
        DecimalFormat df = new DecimalFormat("#.00");
        // calcular y mostrar por pantalla la cantidad de ahorros tras el primer, segundo y tercer años.
        double ahorros1 = ahorros + (ahorros * 0.04);
        double ahorros2 = ahorros1 + (ahorros1 * 0.04);
        double ahorros3 = ahorros2 + (ahorros2 * 0.04);
        
        System.out.println("La cantidad de ahorros tras el primer año es: " + df.format(ahorros1));
        System.out.println("La cantidad de ahorros tras el segundo año es: " + df.format(ahorros2));
        System.out.println("La cantidad de ahorros tras el tercer año es: " + df.format(ahorros3));
        
        scanner.close();
    }
}