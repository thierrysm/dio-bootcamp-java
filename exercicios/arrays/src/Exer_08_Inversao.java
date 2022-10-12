/*
Ler um vetor A com 10 elementos e construir um vetor B de mesmo tipo e tamanho e com
os mesmos elementos de A, sendo que estes deverão estar invertidos, ou seja,
o primeiro elemento de A passa a ser o último de B, o segundo elemento de A passa
a ser o penúlimo de B e assim por diante
*/
public class Exer_08_Inversao {

    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        // Metodo pra gerar números aleatorios entre 0 e 10 no vetor A.
        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++) {
            vetorA[i] = (int) Math.round(Math.random() * 10);
            System.out.print(vetorA[i] + " ");
        }

        System.out.print("\nVetor B = ");
        for (int i=0; i<vetorB.length; i++) {
            vetorB[i] = vetorA[vetorA.length - i - 1];
            System.out.print(vetorB[i] + " ");
        }
    }
}
