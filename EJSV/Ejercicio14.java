import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //leer el número de barras vendidas que no son del día
        System.out.println("Ingrese el número de barras vendidas que no son del día");
        int noVendidas = scanner.nextInt();
        DecimalFormat df = new DecimalFormat("#.00");
        //mostrar el precio habitual de una barra de pan, el descuento que se le hace por no ser fresca y el coste final total.
        double  precioHabitual = 3.49;
        double descuento = 0.6;
        double costeFinal = (precioHabitual * (1 - descuento));
        System.out.println("El precio habitual de una barra de pan es: " + df.format(precioHabitual));
        System.out.println("El descuento que se le hace por no ser fresca es: " + descuento * 100 + "%");
        System.out.println("El coste final total es: " + df.format(costeFinal * noVendidas ));
        scanner.close();
        }
        }



