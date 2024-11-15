public class Ejercicio_3 {
    public static void main(String[] args) {
        //Escribir un programa que imprima los días hábiles de la semana (de lunes a viernes) y omita los fines de semana.
        System.out.println("Días hábiles de la semana: ");
        for (int i = 1; i <= 7; i++) {
            switch (i) {
                case 1:
                    System.out.println("Lunes");
                    break;
                case 2:
                    System.out.println("Martes");
                    break;
                case 3:
                    System.out.println("Miércoles");
                    break;
                case 4:
                    System.out.println("Jueves");
                    break;
                case 5:
                    System.out.println("Viernes");
                    break;
                default:
                    continue;
            }
        }
    }
}