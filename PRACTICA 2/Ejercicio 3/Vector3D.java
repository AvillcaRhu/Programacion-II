
public class Vector3D {

  private double a1;
  private double a2;
  private double a3;
  public Vector3D() {
    this.a1 = 0;
    this.a2 = 0;
    this.a3 = 0;
  }
  public Vector3D(double a1, double a2, double a3) {
    this.a1 = a1;
    this.a2 = a2;
    this.a3 = a3;
  }
  public double getA1() {
    return this.a1;
  }
  public double getA2() {
    return this.a2;
  }
  public double getA3() {
    return this.a3;
  }
  public Vector3D suma(Vector3D b) {
    return new Vector3D(this.a1 + b.a1, this.a2 + b.a2, this.a3 + b.a3);
  }
  public Vector3D multiplicaEscalar(double r) {
    return new Vector3D(r * this.a1, r * this.a2, r * this.a3);
  }
  public double longitud() {
    return Math.sqrt(this.a1 * this.a1 + this.a2 * this.a2 + this.a3 * this.a3);
  }
  public Vector3D normal() {
    double len = this.longitud();
    return new Vector3D(this.a1 / len, this.a2 / len, this.a3 / len);
  }
  public double productoEscalar(Vector3D b) {
    return this.a1 * b.a1 + this.a2 * b.a2 + this.a3 * b.a3;
  }
  public Vector3D productoVectorial(Vector3D b) {
    double x = this.a2 * b.a3 - this.a3 * b.a2;
    double y = this.a3 * b.a1 - this.a1 * b.a3;
    double z = this.a1 * b.a2 - this.a2 * b.a1;
    return new Vector3D(x, y, z);
  }
  public String toString() {
    return String.format("(%.2f, %.2f, %.2f)", this.a1, this.a2, this.a3);
  }
}
