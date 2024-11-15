import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio11 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
            DecimalFormat df = new DecimalFormat("#.00");

    //Pedir cantidad a invertir
    System.out.println("Ingrese la cantidad a invertir: ");
    double cantidad = scanner.nextDouble();

    //Pedir interes anual
    System.out.println("Ingrese el interes anual sin porcentaje: ");

    double interesAnual = scanner.nextDouble();

    //Pedir el numero de años
    System.out.println("Ingrese el numero de años: ");
    int años = scanner.nextInt();
    //calcular y mostrar el resultado obtenido
    double resultado = cantidad * Math.pow ((1 + (interesAnual/100)), años );
    System.out.println("El monto total obtenido es: " + df.format(resultado));

    scanner.close();
  }
  }
  
