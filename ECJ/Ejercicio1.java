import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Introduce el codigo de la puerta");
String codigo = sc.nextLine();
if (codigo.equals("1234")) {
  System.out.println("La puerta se ha abierto");
    } else {
        System.out.println("El codigo es incorrecto,  intenta de nuevo");

        sc.close();

       }
    }      
}