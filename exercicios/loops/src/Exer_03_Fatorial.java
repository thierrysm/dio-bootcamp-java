import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
 */

public class Exer_03_Fatorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para ver o seu fatorial");
        int numero = sc.nextInt();

        int fatorial = numero;

        for (int i=numero-1 ; i>0; i--) {
            fatorial *= i;
        }

        for (int i=numero; i>0; i--) {
            if (i > 1) {
                System.out.print(i + " x ");
            } else {
                System.out.print(i + " = " + fatorial);
            }
        }
        sc.close();
    }
}
