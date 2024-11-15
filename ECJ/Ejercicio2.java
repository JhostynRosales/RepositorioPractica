import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        // Determinar si un número es negativo, positivo o cero
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int numero = sc.nextInt();
        if (numero < 0) {
            System.out.println("El número es negativo");
        } else if (numero > 0) {
            System.out.println("El número es positivo");
        } else {
            System.out.println("El número es cero");
        }
        sc.close();
    }
}

