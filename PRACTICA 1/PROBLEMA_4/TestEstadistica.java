import java.util.Scanner;
public class TestEstadistica {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double[] valores = new double[10];

    System.out.print("Ingrese 10 numeros: ");
    for (int i = 0; i < valores.length; i++) {
      valores[i] = sc.nextDouble();
    }
    Estadistica estadistica = new Estadistica(valores);
    System.out.printf("El promedio es %.2f%n", estadistica.promedio());
    System.out.printf("La desviacion estandard es %.5f%n", estadistica.desviacion());
    sc.close();
  }
}