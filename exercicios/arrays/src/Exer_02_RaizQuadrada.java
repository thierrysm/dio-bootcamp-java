/*
Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tamanho, sendo
que cada elemento do vetor B deverá ser a raiz quadrada do respectivo elemento de A,
ou seja: B[i] = sqrt(A[i]).
*/

public class Exer_02_RaizQuadrada {

    public static void main(String[] args) {

        int[] vetorA = new int[15];
        double[] vetorB = new double[vetorA.length];

        // Metodo pra gerar números aleatorios entre 0 e 10 no vetor A.
        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++) {
            vetorA[i] = (int) Math.round(Math.random() * 10 );
            System.out.print(vetorA[i] + " ");
        }

        System.out.print("\nVetor B = ");
        for (int i=0; i<vetorB.length; i++) {
            vetorB[i] = Math.sqrt(vetorA[i]);
            System.out.print(vetorB[i] + " ");
        }

        System.out.print("\nVetor B arredondado = ");
        for (int i=0; i<vetorB.length; i++) {
            vetorB[i] = (int) Math.sqrt(vetorA[i]);
            System.out.print(vetorB[i] + " ");
        }
    }
}
