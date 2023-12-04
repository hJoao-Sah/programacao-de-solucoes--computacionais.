package binario;

import java.util.Arrays;
import java.util.Scanner;

public class Binario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];
        System.out.println("Digite 10 números ordenados:");

        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
        }

        while (true) {
            System.out.println("Digite o número a ser pesquisado (ou -1 para sair):");
            int numero = scanner.nextInt();

            if (numero == -1) {
                break;
            }

            pesquisaBinaria(vetor, numero);
        }

        scanner.close();
    }

    private static void pesquisaBinaria(int[] vetor, int numero) {
        int comparacoes = 0;
        int index = Arrays.binarySearch(vetor, numero);

        if (index >= 0) {
            System.out.println("Número encontrado na posição " + index);
            comparacoes = vetor.length - Math.abs(index);
        } else {
            System.out.println("Número não encontrado.");
            comparacoes = vetor.length - Math.abs(index) - 1;
        }

        System.out.println("Comparações realizadas: " + comparacoes);
    }
}
