public class TestCronometro {

    public static void main(String[] args) {

        int[] numeros = new int[100000];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100000);
        }

        Cronometro c1 = new Cronometro();

        c1.inicia();

        for (int i = 0; i < numeros.length - 1; i++) {

            int indiceMenor = i;

            for (int j = i + 1; j < numeros.length; j++) {

                if (numeros[j] < numeros[indiceMenor]) {
                    indiceMenor = j;
                }
            }

            int temporal = numeros[i];
            numeros[i] = numeros[indiceMenor];
            numeros[indiceMenor] = temporal;
        }

        c1.detener();

        System.out.println("Tiempo de ordenación: "
                + c1.lapsoDeTiempo() + " milisegundos");
    }
}