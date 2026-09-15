
public class MiPunto {
  private double x;
  private double y;
  public MiPunto() {
    this.x = 0;
    this.y = 0;
  }
  public MiPunto(double x, double y) {
    this.x = x;
    this.y = y;
  }
  public double getX() {
    return this.x;
  }
  public double getY() {
    return this.y;
  }
  public double distancia(MiPunto p) {
    double dx = this.x - p.x;
    double dy = this.y - p.y;
    return Math.sqrt(dx * dx + dy * dy);
  }
  public double distancia(double x, double y) {
    return distancia(new MiPunto(x, y));
  }
  public String toString() {
    return String.format("(%.1f, %.1f)", this.x, this.y);
  }
}
