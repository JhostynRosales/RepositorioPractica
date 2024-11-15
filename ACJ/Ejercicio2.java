public class Ejercicio2 {
    public static void main(String[] args) {
      String[] articulos = {"manzanas", "peras", "aguacates"};
      double[] preciosPorCaja = {4.5, 2.75, 10.0};
      int[] cajasDisponibles = {10, 120, 6};
  
      System.out.println("Artículo\tPrecio por caja\tCajas disponibles");
      System.out.println("---------\t--------------\t-----------------");
  
      for (int i = 0; i < articulos.length; i++) {
        System.out.printf("%-10s\t%10.2f\t%10d%n", 
                           articulos[i], preciosPorCaja[i], cajasDisponibles[i]);
      }
    }
  }