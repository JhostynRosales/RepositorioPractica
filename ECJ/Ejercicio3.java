import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu edad:");
        String edadInput = sc.nextLine();
        int edad = Integer.parseInt(edadInput);
        if (edad >= 18) {
            System.out.println("Puedes votar");
        } else {
            System.out.println("Aun eres muy joven, espera un poco");
        }
        sc.close();
    }      
}
