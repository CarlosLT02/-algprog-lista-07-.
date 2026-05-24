import java.util.ArrayList;
import java.util.Scanner;

public class ComissaoVendedores {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Double> salarios = new ArrayList<>();

        int[] faixas = new int[9];

        System.out.print("Quantos vendedores deseja cadastrar? ");
        int quantidade = sc.nextInt();

        for (int i = 0; i < quantidade; i++) {

            System.out.print("\nDigite o valor das vendas do vendedor "
                    + (i + 1) + ": ");

            double vendas = sc.nextDouble();

            double salario = 200 + (vendas * 0.09);

            salarios.add(salario);

            // Verificando faixa salarial
            if (salario >= 200 && salario <= 299) {
                faixas[0]++;
            } else if (salario <= 399) {
                faixas[1]++;
            } else if (salario <= 499) {
                faixas[2]++;
            } else if (salario <= 599) {
                faixas[3]++;
            } else if (salario <= 699) {
                faixas[4]++;
            } else if (salario <= 799) {
                faixas[5]++;
            } else if (salario <= 899) {
                faixas[6]++;
            } else if (salario <= 999) {
                faixas[7]++;
            } else {
                faixas[8]++;
            }
        }

        System.out.println("\nFaixas salariais:");

        System.out.println("$200 - $299 = " + faixas[0]);
        System.out.println("$300 - $399 = " + faixas[1]);
        System.out.println("$400 - $499 = " + faixas[2]);
        System.out.println("$500 - $599 = " + faixas[3]);
        System.out.println("$600 - $699 = " + faixas[4]);
        System.out.println("$700 - $799 = " + faixas[5]);
        System.out.println("$800 - $899 = " + faixas[6]);
        System.out.println("$900 - $999 = " + faixas[7]);
        System.out.println("$1000 em diante = " + faixas[8]);

        sc.close();
    }
}