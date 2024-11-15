import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //programa que utilice un bucle while para sumar todos los números pares entre 1 y 100 e imprima el resultado final.
        int suma = 0;
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                suma += i;
                }
                i++;
            }
            scanner.close();
            System.out.println("La suma de los números pares entre 1 y 100 es: " + suma);
            }
            }