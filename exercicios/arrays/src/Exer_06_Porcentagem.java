/*
Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a 0 e 1,
sugestão: A[i] = (int)Math.round(Math.random()*); Pede-se para implementar
um programa que determine o percentual de números 0's e i's existentes no
vetor A.
*/

public class Exer_06_Porcentagem {

    public static void main(String[] args) {

        int[] vetorA =  new int[10];

        int zero = 0;
        int um = 0;

        // Metodo pra gerar números aleatorios entre 0 e 1 no vetor A.
        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++) {
            vetorA[i] = (int) Math.round(Math.random() * 1 );
            System.out.print(vetorA[i] + " ");

            if (vetorA[i] == 0) {
                zero++;
            } else {
                um++;
            }
        }

        System.out.println("\nPercentual de zero no vetor A = " + (double)zero/vetorA.length * 100 + "%");
        System.out.println("Percentual de um no vetor A = " + (double)um/vetorA.length * 100 + "%");
    }
}
