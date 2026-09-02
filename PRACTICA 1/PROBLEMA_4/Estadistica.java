public class Estadistica {
  private double[] valores;
  public Estadistica(double[] valores) {
    this.valores = valores;
  }
  public double promedio() {
    double suma = 0;
    for (int i = 0; i < this.valores.length; i++) {
      suma += this.valores[i];
    }
    return suma / this.valores.length;
  }
  public double desviacion() {
    double prom = promedio();
    double suma = 0;
    for (int i = 0; i < this.valores.length; i++) {
      suma += Math.pow(this.valores[i] - prom, 2);
    }
    return Math.sqrt(suma / (this.valores.length - 1));
  }
}