
public class TestAlgebraVectorial {
  public static void main(String[] args) {
    AlgebraVectorial a = new AlgebraVectorial(3, 4);
    AlgebraVectorial b = new AlgebraVectorial(4, -3);
    System.out.println("a = " + a + ", b = " + b);
    System.out.println("¿a y b son perpendiculares? (formula por defecto) " + a.perpendicular(b));
    System.out.println("  usando formula 1 (|a+b| = |a-b|): " + a.perpendicular(b, 1));
    System.out.println("  usando formula 3 (a . b = 0):     " + a.perpendicular(b, 3));
    System.out.println("  usando formula 4 (|a+b|^2 = |a|^2+|b|^2): " + a.perpendicular(b, 4));
    AlgebraVectorial c = new AlgebraVectorial(2, 4);
    AlgebraVectorial d = new AlgebraVectorial(1, 2);
    System.out.println();
    System.out.println("c = " + c + ", d = " + d);
    System.out.println("¿c y d son paralelos? (formula por defecto) " + c.paralela(d));
    System.out.println("  usando formula 1 (c = r*d): " + c.paralela(d, 1));
    System.out.println("  usando formula 2 (c x d = 0): " + c.paralela(d, 2));
    AlgebraVectorial e = new AlgebraVectorial(3, 4);
    AlgebraVectorial f = new AlgebraVectorial(5, 0);
    System.out.println();
    System.out.println("e = " + e + ", f = " + f);
    System.out.println("Proyeccion de e sobre f: " + e.proyeccion(f));
    System.out.printf("Componente de e en direccion de f: %.2f%n", e.componente(f));
  }
}
