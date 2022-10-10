import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor
seja inválido e continue pedindo até que o usuário informe um valor válido.
*/

public class Exer_01_Nota {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insire uma nota de zero a dez");

        boolean notaValida = false;
        int nota =  sc.nextInt();
        while (!notaValida) {
            if (nota >= 0 && nota <= 10) {
                System.out.println("Nota inserida: " + nota);
                notaValida = true;
            } else {
                System.out.println("valor invalido, porfavor informe novamente");
                nota = sc.nextInt();
            }
        }
        sc.close();
    }
}
