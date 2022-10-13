import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("*********** CALCULADORA ***********");
        Calculadora calculadora = new Calculadora();
        calculadora.soma(32, 43);
        calculadora.subtracao(32,43);
        calculadora.multiplicacao(32,43);
        calculadora.divisao(32,43);

        System.out.println("*********** MENSAGEM DO DIA ***********");
        MensagemDoDia mensagemDoDia = new MensagemDoDia();
        mensagemDoDia.mandarMensagem(8);
        mensagemDoDia.mandarMensagem(13);
        mensagemDoDia.mandarMensagem(22);

        System.out.println("*********** EMPRESTIMO ***********");
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.emprestimo(10000.0, 5);
        emprestimo.emprestimo(10000.0, 16);
        emprestimo.emprestimo(10000.0, 22);
        emprestimo.emprestimo(10000.0, 32);
    }
}
