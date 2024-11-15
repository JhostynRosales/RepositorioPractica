import java.util.Scanner;

public class calcularTotal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("¿Es usted cliente VIP? (true/false): ");
        boolean VIP = scanner.nextBoolean();
        
        double Producto1 = 100.0;
        double Producto2 = 50.0;
        double Producto3 = 30.0;

        System.out.println("¿Qué producto quiere comprar? (1, 2, 3)");
        int productoElegido = scanner.nextInt();

        double total = 0.0;

        switch (productoElegido) {
            case 1:
                total = Producto1;
                if (VIP) {
                    total *= 0.90; 
                }
                System.out.println("Total a pagar por el Producto 1: " + total + "$");
                break;
            case 2:
                total = Producto2;
                if (VIP) {
                    total *= 0.90; 
                }
                System.out.println("Total a pagar por el Producto 2: " + total + "$");
                break;
            case 3:
                total = Producto3;
                if (VIP) {
                    total *= 0.90;
                }
                System.out.println("Total a pagar por el Producto 3: " + total + "$");
                break;
            default:
                System.out.println("Producto no válido.");
                scanner.close();
                return; 
        }
        
        scanner.close();
    }
}