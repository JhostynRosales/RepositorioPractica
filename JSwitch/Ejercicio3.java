import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un la calificacion del estudiante");
   //Crea un programa que reciba una calificación (A, B, C, D, F) y muestre el rango de la nota numérica equivalente.
char nota = sc.next().charAt(0);
switch (nota) {
    case 'A':
    System.out.println("La nota es: 93-96");
    break;
    case 'B':
    System.out.println("La nota es: 83-86");
    break;
    case 'C':
    System.out.println("La nota es: 73-76");
    break;
    case 'D':
    System.out.println("La nota es: 63-66");
    break;
    case 'F':
    System.out.println("La nota es: 60-0");
    break;
    
}
sc.close();
    }
}

