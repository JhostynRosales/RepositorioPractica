import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los precios separados por comas: ");
        String[] precios = scanner.nextLine().split(",");
        System.out.println("Ingrese el valor mínimo: ");
        int minimo = scanner.nextInt();
        scanner.nextLine();
        for (String precio : precios) {
            precio = precio.trim();
            try {
                int precioInt = Integer.parseInt(precio);
                if (precioInt > minimo) {
                    System.out.println("Este precio es mayor a " + minimo + ": " + precio);
                }
            } catch (NumberFormatException e) {
                System.out.println("El precio '" + precio + "' no es un número válido. Se omite.");
                continue;
            }
        }
        scanner.close();
    }
}