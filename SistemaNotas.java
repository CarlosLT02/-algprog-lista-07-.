import java.util.ArrayList;
import java.util.Scanner;

public class SistemaNotas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Double> notas = new ArrayList<>();

        double nota;

        System.out.println("Digite as notas (-1 para encerrar):");

        do {

            nota = sc.nextDouble();

            if (nota != -1) {
                notas.add(nota);
            }

        } while (nota != -1);

        // Quantidade
        System.out.println("\nQuantidade de valores: "
                + notas.size());

        // Ordem normal
        System.out.println("\nValores na ordem digitada:");

        for (double n : notas) {
            System.out.print(n + " ");
        }

        // Ordem inversa
        System.out.println("\n\nValores na ordem inversa:");

        for (int i = notas.size() - 1; i >= 0; i--) {
            System.out.println(notas.get(i));
        }

        // Soma
        double soma = 0;

        for (double n : notas) {
            soma += n;
        }

        System.out.println("\nSoma: " + soma);

        // Média
        double media = soma / notas.size();

        System.out.println("Média: " + media);

        // Acima da média
        int acimaMedia = 0;

        for (double n : notas) {

            if (n > media) {
                acimaMedia++;
            }
        }

        System.out.println("Valores acima da média: "
                + acimaMedia);

        // Abaixo de 7
        int abaixoSete = 0;

        for (double n : notas) {

            if (n < 7) {
                abaixoSete++;
            }
        }

        System.out.println("Valores abaixo de 7: "
                + abaixoSete);

        System.out.println("\nPrograma encerrado!");

        sc.close();
    }
}