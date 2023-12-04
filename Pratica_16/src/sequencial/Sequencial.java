package sequencial;


import java.util.Scanner;

public class Sequencial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];
        System.out.println("Digite 10 números:");

        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
        }

        while (true) {
            System.out.println("Digite o número a ser pesquisado (ou -1 para sair):");
            int numero = scanner.nextInt();

            if (numero == -1) {
                break;
            }

            System.out.println("Escolha o algoritmo de busca: ");
            System.out.println("1. Sequencial");
            System.out.println("2. Sequencial com Sentinela");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    pesquisaSequencial(vetor, numero);
                    break;
                case 2:
                    pesquisaSequencialSentinela(vetor, numero);
                    break;
                default:
                    System.out.println("Escolha inválida.");
            }
        }

        scanner.close();
    }

    private static void pesquisaSequencial(int[] vetor, int numero) {
        int comparacoes = 0;
        for (int i = 0; i < vetor.length; i++) {
            comparacoes++;
            if (vetor[i] == numero) {
                System.out.println("Número encontrado na posição " + i);
                System.out.println("Comparações realizadas: " + comparacoes);
                return;
            }
        }
        System.out.println("Número não encontrado.");
        System.out.println("Comparações realizadas: " + comparacoes);
    }

    private static void pesquisaSequencialSentinela(int[] vetor, int numero) {
        int comparacoes = 0;
        int tamanho = vetor.length;
        vetor[tamanho - 1] = numero; 
        int i = 0;

        while (vetor[i] != numero) {
            comparacoes++;
            i++;
        }

        if (i < tamanho - 1) {
            System.out.println("Número encontrado na posição " + i);
            System.out.println("Comparações realizadas: " + comparacoes);
        } else {
            System.out.println("Número não encontrado.");
            System.out.println("Comparações realizadas: " + comparacoes);
        }
    }
}
