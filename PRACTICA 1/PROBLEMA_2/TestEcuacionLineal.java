import java.util.Scanner;
public class TestEcuacionLineal {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese a, b, c, d, e, f: ");
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();
    double d = sc.nextDouble();
    double e = sc.nextDouble();
    double f = sc.nextDouble();
    EcuacionLineal ecuacion = new EcuacionLineal(a, b, c, d, e, f);
    if (ecuacion.tieneSolucion()) {
      System.out.printf("x = %.1f, y = %.1f%n", ecuacion.getX(), ecuacion.getY());
    } else {
      System.out.println("La ecuacion no tiene solucion");
    }
    sc.close();
  }
}
