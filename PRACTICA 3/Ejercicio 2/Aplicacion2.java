
public class Aplicacion2 {

  public static void main(String[] args) {
    JuegoAdivinaNumero juego1 = new JuegoAdivinaNumero(3);
    JuegoAdivinaPar juego2 = new JuegoAdivinaPar(3);
    JuegoAdivinaImpar juego3 = new JuegoAdivinaImpar(3);

    System.out.println("=== Juego: adivina un numero ===");
    juego1.juega();

    System.out.println("=== Juego: adivina un numero par ===");
    juego2.juega();

    System.out.println("=== Juego: adivina un numero impar ===");
    juego3.juega();
  }
}
