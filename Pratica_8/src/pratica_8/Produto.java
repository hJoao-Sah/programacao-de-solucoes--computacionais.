package pratica_8;

import java.util.Scanner;

public class Produto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma = 0;
        boolean continuar;

        do {
            System.out.print("Informe o preço do produto: ");
            double preco = scanner.nextDouble();
            soma += preco;

            System.out.print("Deseja informar o preço de outro produto? (true/false): ");
            continuar = scanner.nextBoolean();
        } while (continuar);

        System.out.println("A soma dos preços é: " + soma);

        scanner.close();
    }
}
