import java.util.Scanner;

public class Ordenacao {
   
    public static void ordenacaoBolha(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    public static void ordenacaoSelecao(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceMenor = i;
            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[indiceMenor]) {
                    indiceMenor = j;
                }
            }
            int temp = vetor[i];
            vetor[i] = vetor[indiceMenor];
            vetor[indiceMenor] = temp;
        }
    }

    public static void ordenacaoInsercao(int[] vetor) {
        int n = vetor.length;
        for (int i = 1; i < n; i++) {
            int chave = vetor[i];
            int j = i - 1;

            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = chave;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Escolha o método de ordenação:");
            System.out.println("1. Bolha");
            System.out.println("2. Seleção");
            System.out.println("3. Inserção");
            System.out.println("4. Sair");

            int opcao = scanner.nextInt();

            if (opcao == 4) {
                System.out.println("Encerrando o programa.");
                break;
            }

            System.out.println("Informe um vetor de 10 números para ser ordenado:");

            int[] vetor = new int[10];
            for (int i = 0; i < 10; i++) {
                vetor[i] = scanner.nextInt();
            }

            switch (opcao) {
                case 1:
                    ordenacaoBolha(vetor);
                    break;
                case 2:
                    ordenacaoSelecao(vetor);
                    break;
                case 3:
                    ordenacaoInsercao(vetor);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    continue;
            }

            System.out.println("Vetor ordenado:");
            for (int num : vetor) {
                System.out.print(num + " ");
            }
            System.out.println();

            System.out.println("Deseja executar o algoritmo novamente? (1 para Sim, 2 para Não)");
        } while (scanner.nextInt() == 1);

        scanner.close();
    }
}
