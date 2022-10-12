/*
Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de
pessoas. Escreva um programa que determine e escreva a menor e a maior idades e
suas respectivas posições.
*/

public class Exer_05_MenorEMaiorIdade {

    public static void main(String[] args) {

        int[] vetorA = new int[10];

        // Metodo pra gerar idades aleatorias até 80 anos no vetor A.
        System.out.print("Vetor A = ");
        for (int i=0; i< vetorA.length; i++) {
            vetorA[i] = (int) Math.round(Math.random() * 80 );
            System.out.print(vetorA[i] + " ");


        }

        int maiorIdade = vetorA[0], posicaoMaior = 0;
        int menorIdade = vetorA[0], posicaoMenor = 0;

        for (int i=0; i< vetorA.length; i++) {
            if (vetorA[i] > maiorIdade) {
                maiorIdade = vetorA[i];
                posicaoMaior = i;
            }
            if (menorIdade > vetorA[i]) {
                menorIdade = vetorA[i];
                posicaoMenor = i;
            }
        }

        System.out.println("\nMaior idade do vetor A = " + maiorIdade + ", posição: " + posicaoMaior);
        System.out.println("Menor idade do vetor A = " + menorIdade + ", posição: " + posicaoMenor);
    }
}
