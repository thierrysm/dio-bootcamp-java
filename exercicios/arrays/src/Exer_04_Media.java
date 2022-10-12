/*
Criar um vetor A com 10 elementos inteiros. Implementar um programa que defina
e escreva a média aritmética simples dos elemntos ímpares armazenados neste vetor.
*/

public class Exer_04_Media {

    public static void main(String[] args) {

        int[] vetorA = new int[10];

        int soma = 0, contador = 0;

        // Metodo pra gerar números aleatorios entre 0 e 10 no vetor A.
        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++) {
            vetorA[i] = (int) Math.round(Math.random() * 10 );
            System.out.print(vetorA[i] + " ");
            if (vetorA[i] %2 != 0) {
                soma += vetorA[i];
                contador++;
            }
        }
        System.out.println("\nMédia dos números impares do vetor A = " + (double) soma/contador);
    }
}
