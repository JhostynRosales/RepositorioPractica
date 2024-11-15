import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe los dias de la semana sin tilde"); 

        //Usando FOR clasifica los días de la semana como "días laborales" o "fines de semana"
        String[] diasSemana = {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
        for (int i = 0; i < diasSemana.length; i++) {
            System.out.println("Ingrese el día de la semana " + (i + 1));
            String dia = scanner.nextLine().toLowerCase();
            //Si el día ingresado es "lunes", "martes", "miércoles","jueves" o "viernes" se considera un día laboral
            if (dia.equals("lunes") || dia.equals("martes") ||  dia.equals("miercoles") || dia.equals("jueves") || dia.equals("viernes")) {
                System.out.println("El día " + dia + " es un día laboral");
            }
            //Si el día ingresado es "sábado" o "domingo" se considera  un fin de semana
            else if (dia.equals("sabado") || dia.equals("domingo")) {
                System.out.println("El día " + dia + " es un fin de semana");
            }
            //Si el día ingresado no es ninguno de los anteriores se considera un día  no válido
            else {
                System.out.println("El día " + dia + " no es un día válido");
            }
        }
        scanner.close();
        
    }
}