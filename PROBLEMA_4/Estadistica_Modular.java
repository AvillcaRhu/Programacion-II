import java.util.Scanner;
public class Estadistica_Modular {
  static double[] valores;
  public static double promedio() {
    double suma = 0;
    for (int i = 0; i < valores.length; i++) {
      suma += valores[i];
    }
    return suma / valores.length;
  }
  public static double desviacion() {
    double prom = promedio();
    double suma = 0;
    for (int i = 0; i < valores.length; i++) {
      suma += Math.pow(valores[i] - prom, 2);
    }
    return Math.sqrt(suma / (valores.length - 1));
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    valores = new double[10];
    System.out.print("Ingrese 10 numeros: ");
    for (int i = 0; i < valores.length; i++) {
      valores[i] = sc.nextDouble();
    }
    System.out.printf("El promedio es %.2f%n", promedio());
    System.out.printf("La desviacion estandard es %.5f%n", desviacion());
    sc.close();
  }
}
