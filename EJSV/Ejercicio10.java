import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número entero: ");
        int n = scanner.nextInt();

        System.out.print("Introduce el segundo número entero distinto de 0: ");
        int m = scanner.nextInt();

        int cociente = n / m;
        int resto = n % m;

        System.out.println("La división resultante de dividir " + n + " entre " + m + " da un cociente " + cociente + " y un resto " + resto);
       scanner.close(); 
       
    }
}