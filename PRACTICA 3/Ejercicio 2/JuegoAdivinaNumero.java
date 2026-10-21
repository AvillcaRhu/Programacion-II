import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego {

  private static Scanner teclado = new Scanner(System.in);

  private int numeroAAdivinar;

  public JuegoAdivinaNumero(int numeroDeVidas) {
    super(numeroDeVidas);
  }

  public boolean validaNumero(int numero) {
    return numero >= 0 && numero <= 10;
  }

  public void juega() {
    reiniciaPartida();
    this.numeroAAdivinar = (int) (Math.random() * 11); // entre 0 y 10

    System.out.println("Adivina un numero entre 0 y 10:");

    while (true) {
      int numero = teclado.nextInt();

      if (!validaNumero(numero)) {
        System.out.println("Ingresa un numero valido (entre 0 y 10):");
        continue;
      }

      if (numero == this.numeroAAdivinar) {
        System.out.println("Acertaste!!");
        actualizaRecord();
        return;
      }

      if (quitaVida()) {
        if (this.numeroAAdivinar > numero) {
          System.out.println("El numero a adivinar es mayor. Intentalo de nuevo:");
        } else {
          System.out.println("El numero a adivinar es menor. Intentalo de nuevo:");
        }
      } else {
        System.out.println("Te quedaste sin vidas. El numero era " + this.numeroAAdivinar);
        return;
      }
    }
  }
}
