
public class TestVector3D {
  public static void main(String[] args) {
    Vector3D a = new Vector3D(1, 2, 3);
    Vector3D b = new Vector3D(4, 5, 6);

    System.out.println("a = " + a);
    System.out.println("b = " + b);

    System.out.println("a + b = " + a.suma(b));
    System.out.println("3 * a = " + a.multiplicaEscalar(3));
    System.out.printf("|a| = %.4f%n", a.longitud());
    System.out.println("normal de a = " + a.normal());
    System.out.printf("a . b = %.2f%n", a.productoEscalar(b));
    System.out.println("a x b = " + a.productoVectorial(b));
  }
}
