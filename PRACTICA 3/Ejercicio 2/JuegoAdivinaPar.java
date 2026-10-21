
public class JuegoAdivinaPar extends JuegoAdivinaNumero {

  public JuegoAdivinaPar(int numeroDeVidas) {
    super(numeroDeVidas);
  }

  @Override
  public boolean validaNumero(int numero) {
    if (numero % 2 != 0) {
      System.out.println("Error: el numero " + numero + " es impar, debe ingresar un numero par.");
      return false;
    }
    return super.validaNumero(numero);
  }
}
