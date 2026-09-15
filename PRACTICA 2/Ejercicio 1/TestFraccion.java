
public class TestFraccion {
  public static void main(String[] args) {
    Fraccion f1 = new Fraccion(1, 4);
    Fraccion f2 = new Fraccion(4, 3);
    System.out.println("f1 = " + f1);
    System.out.println("f2 = " + f2);
    System.out.println("suma = " + f1.suma(f2));
    System.out.println("resta = " + f1.resta(f2));
    System.out.println("multiplica = " + f1.multiplica(f2));
    System.out.println("divide = " + f1.divide(f2));
    System.out.println("f1 como decimal = " + f1.convertirADecimal());
    Fraccion f3 = new Fraccion(4, 1);
    System.out.println("f2 = " + f2 + ", f3 = " + f3);
    System.out.println("¿f2 es inverso de f3? " + f2.esInverso(f3));
    Fraccion f4 = Fraccion.parseFraccion("-2/3");
    System.out.println("parseFraccion(\"-2/3\") = " + f4);
    System.out.println("parseFraccion(f1.toString()).equals(f1) = "
        + Fraccion.parseFraccion(f1.toString()).equals(f1));
    Fraccion f5 = new Fraccion(2, 8);
    Fraccion f6 = new Fraccion(14, 28);
    System.out.println(f5 + " simplificada = " + f5.simplifica());
    System.out.println(f6 + " simplificada = " + f6.simplifica());
  }
}
