import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Introdusca contraseña");
        String contraseña = sc.nextLine();
        //verificar si la langutud es suficiente
        if (contraseña.length() < 8) {
            System.out.println("La contraseña debe tener al menos 8 caracteres");
            } else {
                System.out.println("La contraseña es segura");
                sc.close();
            }
        }
    }
