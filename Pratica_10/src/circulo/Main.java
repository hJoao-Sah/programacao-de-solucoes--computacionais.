package circulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe as coordenadas (x, y) e o raio do círculo:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        double raio = scanner.nextDouble();

        Circulo circulo = new Circulo(x, y, raio);

       int escolha;
        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Mover");
            System.out.println("2 - Aumentar");
            System.out.println("3 - Imprimir");
            System.out.println("4 - Sair");

            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Digite o deslocamento em X e Y:");
                    int deslocX = scanner.nextInt();
                    int deslocY = scanner.nextInt();
                    circulo.moveX(deslocX);
                    circulo.moveY(deslocY);
                    break;
                case 2:
                    System.out.println("Digite o fator de aumento do raio:");
                    double fator = scanner.nextDouble();
                    circulo.aumenta(fator);
                    break;
                case 3:
                    System.out.println(circulo.exibe());
                    break;
                case 4:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (escolha != 4);
    }
}