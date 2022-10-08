package vnw.arraypulavalor;

import java.util.Arrays;

public class InterfaceConsole {

    public static void main(String[] args) {

        int vetorInicial[] = { 1, 2, 3, 4, 5 };
        Vetor vetor = new Vetor();
        vetor.pular(vetorInicial,10);

        System.out.println(Arrays.toString(vetorInicial));
    }
}
