import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Calculadora simple que reciba dos números y una operación (+, -, *, /)
        System.out.println("Ingrese el primer número: ");
        double num1 = sc.nextDouble();
        System.out.println("Ingrese el segundo número: ");
        double num2 = sc.nextDouble();
        System.out.println("Ingrese la operación (+, -, *, /): ");
        char operacion = sc.next().charAt(0);

        // Switch para realizar la operación correspondiente
        switch (operacion) {
            case '+':
                System.out.println("La suma de los dos números es: " + (num1 + num2));
                break;
            case '-':
                System.out.println("La resta de los dos números es: " + (num1 - num2));
                break;
            case '*':
                System.out.println("La multiplicación de los dos números es: " + (num1 * num2));
                break; // Aquí agregué el break que faltaba
            case '/':
                if (num2 != 0) {
                    System.out.println("La división de los dos números es: " + (num1 / num2));
                } else {
                    System.out.println("Lo siento, no se puede dividir entre cero");
                }
                break;
            default:
                System.out.println("Operación no válida");
                break; 
        }
        sc.close(); 
    }
}

















