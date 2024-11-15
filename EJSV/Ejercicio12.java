import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        final int PESO_PAYASO = 112; 
        final int PESO_MUÑECA = 75; 

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de payasos vendidos: ");
        int numPayasos = scanner.nextInt();
        System.out.print("Ingrese el número de muñecas vendidos: ");
        int numMuñecas = scanner.nextInt();

        int pesoTotal = calcularPesoTotal(numPayasos, PESO_PAYASO, numMuñecas, PESO_MUÑECA);

        System.out.println("El peso total del paquete es: " + pesoTotal + " gramos");
        scanner.close();

    }

    /**
     * Calcula el peso total del paquete basado en el número de payasos y muñecas.
     *
     * @param numPayasos número de payasos
     * @param pesoPayaso peso de cada payaso
     * @param numMuñecas número de muñecas
     * @param pesoMuñeca peso de cada muñeca
     * @return peso total del paquete
     */
    public static int calcularPesoTotal(int numPayasos, int pesoPayaso, int numMuñecas, int pesoMuñeca) {
        return numPayasos * pesoPayaso + numMuñecas * pesoMuñeca;
    }
    
}