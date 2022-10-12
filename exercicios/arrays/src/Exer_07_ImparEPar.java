/*
Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho,
obedecendo as seguintes regras de formação: a) B deverá receber 1 quando A for par;
b) B deverá deverá receber 0 quando A for ímpar.
*/

public class Exer_07_ImparEPar {

    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        // Metodo pra gerar números aleatorios entre 0 e 10 no vetor A.
        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++) {
            vetorA[i] = (int) Math.round(Math.random() * 10 );
            System.out.print(vetorA[i] + " ");

            if (vetorA[i] %2 == 0) {
                vetorB[i] = 1;
            } else {
                vetorB[i] = 0;
            }
        }

        System.out.print("\nVetor B = ");
        for (int vetor : vetorB) {
            System.out.print(vetor + " ");
        }
    }
}
