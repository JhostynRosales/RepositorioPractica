public class Ejercicio1 {
    public static void main(String[] args) {
        // Número entero sin decimales
        int entero = 987654;
        System.out.printf("Número entero: %d%n", entero);

        // Número decimal estándar
        double decimal = 987654.0987465;
        System.out.printf("Número decimal estándar: %f%n", decimal);

        // Número decimal con un formato preciso que limite la cantidad de decimales
        System.out.printf("Número decimal con 2 decimales: %.2f%n", decimal);
        System.out.printf("Número decimal con 4 decimales: %.4f%n", decimal);
    }
}