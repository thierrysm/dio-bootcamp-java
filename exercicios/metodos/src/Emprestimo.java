public class Emprestimo {

    /*
        ***** Regras de negocio *****
        parcelas menor que 10, taxa de 4%
        parcelas maior que 10 e menor que 20, taxa de 9%
        parcelas maior que 20 e menor que 30, taxa de 13%
        parcelas maior que 30, taxa de 20%
    */

    public void emprestimo (double valor, int qntdParcelas) {

        double taxa = 0;

        if (qntdParcelas < 10) {
            taxa = 0.4;
            double valorTotal = valor + (valor * taxa);
            System.out.println("Valor de emprestimo: " + valor + ", quantidade de parcelas: " + qntdParcelas);
            System.out.println("Valor das parcelas : " + qntdParcelas + "x de " + valorTotal / qntdParcelas);
            System.out.println("Valor total com os juros: " + valorTotal);
        } else if (qntdParcelas > 10 && qntdParcelas < 20) {
            taxa = 0.9;
            double valorTotal = valor + (valor * taxa);
            System.out.println("Valor de emprestimo: " + valor + ", quantidade de parcelas: " + qntdParcelas);
            System.out.println("Valor das parcelas : " + qntdParcelas + "x de " + valorTotal / qntdParcelas);
            System.out.println("Valor total com os juros: " + valorTotal);
        } else if (qntdParcelas > 20 && qntdParcelas < 30) {
            taxa = 1.3;
            double valorTotal = valor + (valor * taxa);
            System.out.println("Valor de emprestimo: " + valor + ", quantidade de parcelas: " + qntdParcelas);
            System.out.println("Valor das parcelas : " + qntdParcelas + "x de " + valorTotal / qntdParcelas);
            System.out.println("Valor total com os juros: " + valorTotal);
        } else {
            taxa = 2.0;
            double valorTotal = valor + (valor * taxa);
            System.out.println("Valor de emprestimo: " + valor + ", quantidade de parcelas: " + qntdParcelas);
            System.out.println("Valor das parcelas : " + qntdParcelas + "x de " + valorTotal / qntdParcelas);
            System.out.println("Valor total com os juros: " + valorTotal);
        }
    }
}
