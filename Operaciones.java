public class Operaciones {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        //suma
        int suma = a + b;
        System.out.println("La suma de a y b es: " + suma); //salida 30
        
        //resta
        int resta = a - b;
        System.out.println("La resta de a y b es: " + resta); //salida  -10


        //Multiplicacion
        int multiplicacion = a * b;
        System.out.println("La multiplicacion de a y b es: " + multiplicacion); //salida  200


        //division
        int division = a / b;
        System.out.println("La division de a y b es: " + division); // salida 0

        //modulo (residuo de la division)
        int modulo = a % b;
        System.out.println("El residuo de la division de a y b es: " + modulo); //salida 0
        
        //menor que
        int  menor = a < b ? a : b;
        System.out.println("El menor de a y b es: " + menor); //salida


    }
}