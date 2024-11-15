import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca una frase: ");
        String frase = scanner.nextLine();
        frase = frase.toLowerCase();
        int contador = 0;
        int i = 0;
        while (i < frase.length()) {
            char caracter = frase.charAt(i);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u' || 
                caracter == '\u00E1' || caracter == '\u00E9' || caracter == '\u00ED' || caracter == '\u00F3' || caracter == '\u00FA' || 
                caracter == '\u00FC') {
                contador++;
            }
            i++;
        }
        scanner.close();
        System.out.println("La frase tiene " + contador + " vocales");
    }
}
