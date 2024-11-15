import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los edades de un grupo de personas separadas por comas: ");
        String[] edades = scanner.nextLine().split(",");
        //Calcular el promedio e imprimir
        double suma = 0;
        for (int i = 0; i < edades.length; i++) {
            suma += Integer.parseInt(edades[i].trim());
            }
            double promedio = suma / edades.length;
            System.out.println("El promedio de las edades es: " + promedio);
            scanner.close();
            }
            }











