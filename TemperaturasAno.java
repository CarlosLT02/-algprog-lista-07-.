import java.util.ArrayList;
import java.util.Scanner;

public class TemperaturasAno {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Double> temperaturas = new ArrayList<>();

        String[] meses = {
                "Janeiro", "Fevereiro", "Março",
                "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro",
                "Outubro", "Novembro", "Dezembro"
        };

        double soma = 0;

        // Entrada das temperaturas
        for (int i = 0; i < 12; i++) {

            System.out.print("Digite a temperatura de "
                    + meses[i] + ": ");

            double temp = sc.nextDouble();

            temperaturas.add(temp);

            soma += temp;
        }

        double media = soma / 12;

        System.out.println("\nMédia anual: " + media);

        System.out.println("\nTemperaturas acima da média:");

        for (int i = 0; i < temperaturas.size(); i++) {

            if (temperaturas.get(i) > media) {

                System.out.println(
                        meses[i] + " - "
                        + temperaturas.get(i)
                );
            }
        }

        sc.close();
    }
}