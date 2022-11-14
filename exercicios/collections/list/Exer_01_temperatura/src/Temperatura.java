import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
Faça um programa que receba a temperatura média dos 6
primeiros meses do ano e armazene-as em uma lista.

Após isto, calcule a média semestral das temperaturas e
mostre todas as temperaturas acima desta média, e em que
mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2
– Fevereiro e etc).
 */

public class Temperatura {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Double> temperaturaMeses = new ArrayList<>();

        for (int i=0; i<6; i++) {
            System.out.println("Insira a temperatura do mês " + (i+1));
            temperaturaMeses.add(sc.nextDouble());
        }

        System.out.println("temperatura dos meses do primeiro semestre");
        System.out.println(temperaturaMeses);

        Iterator<Double> iterator = temperaturaMeses.iterator();
        double soma = 0;
        while (iterator.hasNext()) {
            double next = iterator.next();
            soma += next;
        }

        double media = soma/temperaturaMeses.size();
        System.out.println("Média semestral das temperaturas: " + media);

        System.out.println("mesés em que a temperatura ultrapassou a média");
        for (int i=0; i<temperaturaMeses.size(); i++) {
            if (temperaturaMeses.get(i) > media) {
                int temp = temperaturaMeses.indexOf(temperaturaMeses.get(i));
                switch (temp) {
                    case 0:
                        System.out.println("Janeiro ");
                        break;
                    case 1:
                        System.out.println("Fevereiro" );
                        break;
                    case 2:
                        System.out.println("Março ");
                        break;
                    case 3:
                        System.out.println("Abril ");
                        break;
                    case 4:
                        System.out.println("Maio ");
                        break;
                    case 5:
                        System.out.println("Junho ");
                        break;
                    default:
                        break;
                }
            }
        }
        sc.close();
    }
}

