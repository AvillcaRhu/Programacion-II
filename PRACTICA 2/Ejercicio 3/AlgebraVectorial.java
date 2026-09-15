
public class AlgebraVectorial {

  private double x;
  private double y;
  public AlgebraVectorial() {
    this.x = 0;
    this.y = 0;
  }
  public AlgebraVectorial(double x, double y) {
    this.x = x;
    this.y = y;
  }
  public double getX() {
    return this.x;
  }
  public double getY() {
    return this.y;
  }
  public AlgebraVectorial suma(AlgebraVectorial b) {
    return new AlgebraVectorial(this.x + b.x, this.y + b.y);
  }
  public AlgebraVectorial resta(AlgebraVectorial b) {
    return new AlgebraVectorial(this.x - b.x, this.y - b.y);
  }
  public AlgebraVectorial escalar(double r) {
    return new AlgebraVectorial(r * this.x, r * this.y);
  }
  public double magnitud() {
    return Math.sqrt(this.x * this.x + this.y * this.y);
  }
  public double productoPunto(AlgebraVectorial b) {
    return this.x * b.x + this.y * b.y;
  }

  public double productoCruz(AlgebraVectorial b) {
    return this.x * b.y - this.y * b.x;
  }
  public boolean perpendicular(AlgebraVectorial b) {
    return perpendicular(b, 3);
  }
  public boolean perpendicular(AlgebraVectorial b, int formula) {
    final double EPS = 1e-9;
    switch (formula) {
      case 1:
        return Math.abs(this.suma(b).magnitud() - this.resta(b).magnitud()) < EPS;
      case 2:
        return Math.abs(this.resta(b).magnitud() - b.resta(this).magnitud()) < EPS;
      case 4:
        double sumaCuad = Math.pow(this.suma(b).magnitud(), 2);
        double sumaCuadIndividual = Math.pow(this.magnitud(), 2) + Math.pow(b.magnitud(), 2);
        return Math.abs(sumaCuad - sumaCuadIndividual) < EPS;
      case 3:
      default:
        return Math.abs(this.productoPunto(b)) < EPS;
    }
  }
  public boolean paralela(AlgebraVectorial b) {
    return paralela(b, 2);
  }
  public boolean paralela(AlgebraVectorial b, int formula) {
    final double EPS = 1e-9;
    if (formula == 1) {
      if (b.x == 0 && b.y == 0) {
        return this.x == 0 && this.y == 0;
      }
      Double r = null;
      if (b.x != 0) {
        r = this.x / b.x;
      } else if (b.y != 0) {
        r = this.y / b.y;
      }
      return r != null && Math.abs(this.x - r * b.x) < EPS && Math.abs(this.y - r * b.y) < EPS;
    }
    return Math.abs(this.productoCruz(b)) < EPS;
  }
  public AlgebraVectorial proyeccion(AlgebraVectorial b) {
    double factor = this.productoPunto(b) / Math.pow(b.magnitud(), 2);
    return b.escalar(factor);
  }
  public double componente(AlgebraVectorial b) {
    return this.productoPunto(b) / b.magnitud();
  }
  public String toString() {
    return String.format("(%.2f, %.2f)", this.x, this.y);
  }
}
