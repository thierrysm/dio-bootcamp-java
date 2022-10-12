/*
Criar um vetor A com 10 elementos inteiros. Implementar um programa que
defina e escreva a soma de todos os elementos armazenados neste vetor
*/

public class Exer_03_Soma {

    public static void main(String[] args) {

        int[] vetorA =  new int[10];

        int soma = 0;

        // Metodo pra gerar números aleatorios entre 0 e 10 no vetor A.
        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++) {
            vetorA[i] = (int) Math.round(Math.random() * 10 );
            System.out.print(vetorA[i] + " ");
            soma += vetorA[i];
        }

        System.out.println("\nSoma total dos valores do vetor A = " + soma);
    }
}
