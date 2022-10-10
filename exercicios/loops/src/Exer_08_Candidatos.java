import java.util.Scanner;

/*
Numa eleição existem três candidatos. Faça um programa que peça o número total de eleitores.
Peça para cada eleitor votar e ao final mostrar o número de votos de cada candidato.
*/

public class Exer_08_Candidatos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Numero total de eleitores?");
        int numeroDeEleitores = sc.nextInt();

        int numCanditado1 = 23, contadorCanditado1 = 0;
        int numCanditado2 = 12, contadorCanditado2 = 0;;
        int numCanditado3 = 18, contadorCanditado3 = 0;;

        for (int i=0; i<numeroDeEleitores; i++) {
            System.out.print("Digite o número do candidato que deseja votar: ");
            int voto = sc.nextInt();

            if (voto == numCanditado1) {
                contadorCanditado1++;
            } else if (voto == numCanditado2) {
                contadorCanditado2++;
            } else if (voto == numCanditado3) {
                contadorCanditado3++;
            } else {
                System.out.println("Número invalido, voto não computado");
            }
        }
        System.out.println("Apuração de votos");
        System.out.println("Candidato 1 : " + contadorCanditado1 + " votos");
        System.out.println("Candidato 2 : " + contadorCanditado2 + " votos");
        System.out.println("Candidato 3 : " + contadorCanditado3 + " votos");

        sc.close();
    }
}
