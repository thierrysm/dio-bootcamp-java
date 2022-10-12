/*
Criar um vetor A com 10 elementos inteiros. Contruir um vetor B de mesmo tipo
e tamanho, sendo que cada elemento do vetor B deverá ser o respectivo elemento
de A multiplicado por sua posição (ou ìndice), ou seja: B[i] = A[i] * i.
*/

public class Exer_01_MultiplicacaoDeVetor {

    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        // Metodo pra gerar números aleatorios entre 0 e 10 no vetor A.
        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++) {
            vetorA[i] = (int) Math.round(Math.random() * 10 );
            System.out.print(vetorA[i] + " ");
        }

        System.out.print("\nVetor B = ");
        for (int i=0; i<vetorB.length; i++) {
            vetorB[i] = vetorA[i] * i;
            System.out.print(vetorB[i] + " ");
        }
    }
}
