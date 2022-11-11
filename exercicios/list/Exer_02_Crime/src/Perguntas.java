import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/

public class Perguntas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> perguntas = new ArrayList<>();

        for (int i=0; i<5; i++) {
            switch (i) {
                case 0:
                    System.out.println("1. Telefonou para a vítima?");
                    perguntas.add(sc.next());
                    break;
                case 1:
                    System.out.println("2. Esteve no local do crime?");
                    perguntas.add(sc.next());
                    break;
                case 2:
                    System.out.println("3. Mora perto da vítima?");
                    perguntas.add(sc.next());
                    break;
                case 3:
                    System.out.println("4. Devia para a vítima?");
                    perguntas.add(sc.next());
                    break;
                case 4:
                    System.out.println("5. Já trabalhou com a vítima?");
                    perguntas.add(sc.next());
                    break;
                default:
                    break;
            }
        }

        int contador = 0;
        for (String p : perguntas) {
            if (p.equalsIgnoreCase("sim")){
                contador++;
            }
        }

        switch (contador) {
            case 2:
                System.out.println("Classificada como suspeita");
                break;
            case 3:
            case 4:
                System.out.println("Classificada como cúmplice");
                break;
            case 5:
                System.out.println("Classificada como assassina");
                break;
            default:
                System.out.println("Classificada como inocente");
                break;
        }
        sc.close();
    }
}
