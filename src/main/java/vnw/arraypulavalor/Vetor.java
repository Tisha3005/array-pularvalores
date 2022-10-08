package vnw.arraypulavalor;

public class Vetor implements Acao {
    @Override
    public void pular(int[] numeros, int pulos) {

        if (pulos < 0) {

            pulos = Math.abs(pulos) % numeros.length;
            int indiceQueReceberaOsElementosIgualAQtdeDePulos = numeros.length;
            int vetorParaGuardarElementosTemporarioParaDeslocamento[] = new int[pulos];

            for (int i = 0; i < pulos; i++) {
                vetorParaGuardarElementosTemporarioParaDeslocamento[i] = numeros[i];
            }

            for (int i = pulos; i < indiceQueReceberaOsElementosIgualAQtdeDePulos; i++) {
                numeros[i - pulos] = numeros[i];
            }

            for (int i = 0; i < pulos; i++) {
                numeros[i + indiceQueReceberaOsElementosIgualAQtdeDePulos - pulos] = vetorParaGuardarElementosTemporarioParaDeslocamento[i];
            }

        } else {

            pulos = pulos % numeros.length;

            for (int i = 0; i < pulos; i++) {
                int aux = numeros[numeros.length - 1];
                for (int j = 0; j < numeros.length - 1; j++) {
                    numeros[numeros.length - 1 - j] = numeros[numeros.length - 2 - j];
                }
                numeros[0] = aux;
            }

        }
    }
}