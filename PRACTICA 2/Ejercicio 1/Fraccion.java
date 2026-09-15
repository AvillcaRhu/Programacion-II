
public class Fraccion {
  private int numerador;
  private int denominador;
  public Fraccion() {
    this.numerador = 0;
    this.denominador = 1;
  }
  public Fraccion(int n, int d) {
    this.numerador = n;
    this.denominador = d;
  }
  @Override
  public boolean equals(Object o) {
    if (o instanceof Fraccion) {
      Fraccion f = (Fraccion) o;
      return f.numerador == this.numerador && f.denominador == this.denominador;
    } else
      return false;
  }
  @Override
  public String toString() {
    return String.format("%d/%d", this.numerador, this.denominador);
  }
  public Fraccion suma(Fraccion o) {
    int n = (this.numerador * o.denominador) + (this.denominador * o.numerador);
    int d = this.denominador * o.denominador;
    return new Fraccion(n, d);
  }
  public Fraccion resta(Fraccion o) {
    Fraccion c = new Fraccion();
    c.numerador = (this.numerador * o.denominador) - (this.denominador * o.numerador);
    c.denominador = this.denominador * o.denominador;
    return c;
  }
  public Fraccion multiplica(Fraccion o) {
    int n = this.numerador * o.numerador;
    int d = this.denominador * o.denominador;
    return new Fraccion(n, d);
  }
  public Fraccion divide(Fraccion o) {
    int n = this.numerador * o.denominador;
    int d = this.denominador * o.numerador;
    return new Fraccion(n, d);
  }
  public double convertirADecimal() {
    if (this.denominador == 0) {
      throw new ArithmeticException("No se puede dividir entre 0");
    }
    return (double) this.numerador / this.denominador;
  }
  public boolean esInverso(Fraccion o) {
    Fraccion producto = this.multiplica(o);
    return producto.numerador == producto.denominador;
  }
  public static Fraccion parseFraccion(String str) {
    String[] partes = str.trim().split("/");
    int n = Integer.parseInt(partes[0].trim());
    int d = Integer.parseInt(partes[1].trim());
    return new Fraccion(n, d);
  }
  public Fraccion simplifica() {
    int divisor = mcd(Math.abs(this.numerador), Math.abs(this.denominador));
    if (divisor == 0) {
      divisor = 1;
    }
    return new Fraccion(this.numerador / divisor, this.denominador / divisor);
  }
  private int mcd(int a, int b) {
    if (b == 0) {
      return a;
    }
    return mcd(b, a % b);
  }
}
