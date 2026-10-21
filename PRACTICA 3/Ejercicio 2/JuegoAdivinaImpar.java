
public class JuegoAdivinaImpar extends JuegoAdivinaNumero {

  public JuegoAdivinaImpar(int numeroDeVidas) {
    super(numeroDeVidas);
  }

  @Override
  public boolean validaNumero(int numero) {
    if (numero % 2 == 0) {
      System.out.println("Error: el numero " + numero + " es par, debe ingresar un numero impar.");
      return false;
    }
    return super.validaNumero(numero);
  }
}
