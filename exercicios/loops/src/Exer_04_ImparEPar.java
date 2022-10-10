import java.util.Scanner;

/*
Faça um programa que peça N números inteiros, calcule e mostre a quantidade
de números pares e a quantidade de números impares.
*/

public class Exer_04_ImparEPar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de números");
        int n = sc.nextInt();

        int par = 0, impar = 0;

        for (int i=0; i<n; i++) {
            System.out.println("Digite o °" + (i+1) +  " número");
            int num = sc.nextInt();

            if (num %2 == 0) {
                par++;
            } else {
                impar++;
            }
        }
        System.out.println("Quantidade de números pares: " + par);
        System.out.println("Quantidade de números impares: " + impar);

        sc.close();
    }
}
