import java.util.ArrayList;
import java.util.Scanner;

public class Investigacao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> respostas = new ArrayList<>();

        String[] perguntas = {
                "Telefonou para a vítima?",
                "Esteve no local do crime?",
                "Mora perto da vítima?",
                "Devia para a vítima?",
                "Já trabalhou com a vítima?"
        };

        int positivos = 0;

        for (int i = 0; i < perguntas.length; i++) {

            System.out.println(perguntas[i]);
            System.out.print("Responda sim ou nao: ");

            String resposta = sc.nextLine();

            respostas.add(resposta);

            if (resposta.equalsIgnoreCase("sim")) {
                positivos++;
            }
        }

        System.out.println();

        if (positivos == 2) {

            System.out.println("Classificação: Suspeita");

        } else if (positivos >= 3 && positivos <= 4) {

            System.out.println("Classificação: Cúmplice");

        } else if (positivos == 5) {

            System.out.println("Classificação: Assassino");

        } else {

            System.out.println("Classificação: Inocente");
        }

        sc.close();
    }
}