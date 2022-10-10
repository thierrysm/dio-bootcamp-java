import java.util.Scanner;

/*
Faça um programa que leia 5 números e informe a soma e a média dos números.
*/

public class Exer_05_Media {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 5 numeros");

        int soma = 0;

        for (int i=0; i<5; i++) {
            System.out.println("Digite o " + (i+1) + " número");
            int num = sc.nextInt();

            soma += num;
        }

        System.out.println("Soma dos números = " + soma);
        System.out.println("Média dos números = " + soma/5);

        sc.close();
    }
}
