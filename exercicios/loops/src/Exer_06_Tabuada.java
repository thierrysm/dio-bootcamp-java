import java.util.Scanner;

/*
Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/

public class Exer_06_Tabuada {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Infome o número que deseja ver a tabuada");
        int num = sc.nextInt();

        System.out.println("Tabuada de: " + num);
        for (int i=1; i<=10; i++) {
            System.out.println(num + " X " + i + " = " + num*i);
        }
        sc.close();
    }
}
