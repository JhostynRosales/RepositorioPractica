import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca una frase: "); 
        String frase = scanner.nextLine(); 

        String fraseInvertida = ""; 
        int longitud = frase.length(); 

        int i = longitud - 1; 
        do {
            fraseInvertida += frase.charAt(i); 
            i--; 
        } while (i >= 0); 

        scanner.close();
        System.out.println("La frase invertida es: " + fraseInvertida); 
    }
}