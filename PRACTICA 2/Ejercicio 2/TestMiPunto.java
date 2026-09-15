
public class TestMiPunto {
  public static void main(String[] args) {
    MiPunto p1 = new MiPunto(0, 0);
    MiPunto p2 = new MiPunto(10, 30.5);
    System.out.println("p1 = " + p1);
    System.out.println("p2 = " + p2);
    System.out.printf("Distancia entre p1 y p2: %.4f%n", p1.distancia(p2));
    System.out.printf("Distancia entre p1 y (10, 30.5): %.4f%n", p1.distancia(10, 30.5));
  }
}
