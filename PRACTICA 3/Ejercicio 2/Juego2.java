
public class Juego2 {

  private int numeroDeVidas;

  private int record;

  private int vidasIniciales;

  public Juego2(int numeroDeVidas) {
    this.numeroDeVidas = numeroDeVidas;
    this.vidasIniciales = numeroDeVidas;
    this.record = 0;
  }

  public void reiniciaPartida() {
    this.numeroDeVidas = this.vidasIniciales;
  }

  public void actualizaRecord() {
    if (this.numeroDeVidas > this.record) {
      this.record = this.numeroDeVidas;
      System.out.println("Nuevo record: " + this.record + " vida(s) restante(s)");
    }
  }

  public boolean quitaVida() {
    this.numeroDeVidas--;
    return this.numeroDeVidas > 0;
  }
}
