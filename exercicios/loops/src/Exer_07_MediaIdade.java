import java.util.Scanner;

/*
Faça um programa que peça para n pessoas a sua idade, ao final o programa devera
verificar se a média de idade da turma varia entre 0 e 25,26 e 60 e maior que 60;
e então, dizer se a turma é jovem, adulta ou idosa, conforme a média calculada
*/

public class Exer_07_MediaIdade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de pessoas");
        int n = sc.nextInt();

        double soma = 0;

        for (int i=0; i<n; i++) {
            System.out.println("Informa a idade da °" + (i+1) + " pessoa");
            int idade = sc.nextInt();

            soma += idade;
        }

        double media = soma/n;
        if (media >= 0 && media <= 25) {
            System.out.println("A média de idades é :" + media + ", portando é uma turma jovem");
        } else if (media >= 26 && media <= 60) {
            System.out.println("A média de idades é :" + media + ", portando é uma turma adulta");
        } else {
            System.out.println("A média de idades é :" + media + ", portando é uma turma idosa");
        }
        sc.close();
    }
}
