import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //programa que solicite al usuario una lista de nombres
        System.out.println("Ingrese los nombres de las personas separados por comas: ");
        String nombres = scanner.nextLine();
        String nombre = null;
        boolean encontrado = false;
        for (String nombre2 : nombres.split(",")) {
            if (nombre2.trim().toUpperCase().startsWith("A")) {
                nombre = nombre2.trim();
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("El nombre que empieza por A es: " + nombre);
        } else {
            System.out.println("El nombre que empieza por A no existe");
            scanner.close();
        }
    }
}


        

