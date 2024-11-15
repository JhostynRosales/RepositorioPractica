import java.util.Scanner;

public class Media_Notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el número de notas: "); 
        int n = scanner.nextInt();
        
        double[] notas = new double[n];
        double suma = 0; 

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": "); 
            notas[i] = scanner.nextDouble();
            suma += notas[i]; 
        }

        scanner.close(); 

        double media = suma / n; 
        System.out.println("La media de las notas es: " + media);
    }
}