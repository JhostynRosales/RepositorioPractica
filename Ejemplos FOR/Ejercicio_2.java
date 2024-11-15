import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//Crea un programa en Java que imprima la tabla de multiplicar del número 5. 
System.out.println("Ingrese un número para generar su tabla de multiplicar");
int numero = scanner.nextInt();
for (int i = 1; i <= 10; i++) {
    System.out.println(numero + " x " + i + " = " + numero * i);
}
scanner.close();
    }
}


