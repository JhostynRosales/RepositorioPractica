import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su peso en kg: ");
        double peso = scanner.nextDouble();
        System.out.print("Ingrese su estatura en metros: ");
        double estatura = scanner.nextDouble();
        double imc = peso / (estatura * estatura);
        double imcRedondeado = Math.round(imc * 100.0) / 100.0;

        System.out.println("Tu índice de masa corporal es " + imcRedondeado);
        scanner.close();
    }
}