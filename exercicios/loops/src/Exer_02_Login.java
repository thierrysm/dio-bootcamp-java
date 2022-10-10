import java.util.Scanner;

/*
Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao
nome do usuário,mostrando uma mensagem de erro e voltando a pedir as informações.
 */

public class Exer_02_Login {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira seu nome de usuário e a sua senha");
        System.out.print("Nome de usuário: ");
        String nomeDeUsuario = sc.nextLine();
        System.out.print("Senha: ");
        String senha = sc.nextLine();

        boolean dadosValidos = false;

        while (!dadosValidos) {
            if (nomeDeUsuario.equalsIgnoreCase(senha)) {
                System.out.println("Dados informados invalidos, o número de usuário e a senha não podem ser iguais");
                System.out.println("Digite novamente");

                System.out.print("Nome de usuário: ");
                nomeDeUsuario = sc.nextLine();
                System.out.print("Senha: ");
                senha = sc.nextLine();
            } else {
                System.out.println("Logado com sucesso");
                dadosValidos = true;
            }
        }
        sc.close();
    }
}
