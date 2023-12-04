package uniao_conjutos;

import java.util.Arrays;
import java.util.Scanner;

public class UniaoConjuntos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        System.out.println("Digite 10 números para o conjunto A:");
        preencherVetor(scanner, vetorA);

        System.out.println("Digite 10 números para o conjunto B:");
        preencherVetor(scanner, vetorB);

        Arrays.sort(vetorA);
        Arrays.sort(vetorB);

        int[] conjuntoA = removerDuplicatas(vetorA);
        int[] conjuntoB = removerDuplicatas(vetorB);

        int[] conjuntoC = uniaoConjuntos(conjuntoA, conjuntoB);

        System.out.println("Conjunto A: " + Arrays.toString(conjuntoA));
        System.out.println("Conjunto B: " + Arrays.toString(conjuntoB));
        System.out.println("Conjunto C (A ∪ B): " + Arrays.toString(conjuntoC));

        scanner.close();
    }

    private static void preencherVetor(Scanner scanner, int[] vetor) {
        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
        }
    }

    private static int[] removerDuplicatas(int[] vetor) {
        int tamanho = vetor.length;
        int[] resultado = new int[tamanho];
        int pos = 0;
        resultado[pos++] = vetor[0];

        for (int i = 1; i < tamanho; i++) {
            if (vetor[i] != vetor[i - 1]) {
                resultado[pos++] = vetor[i];
            }
        }

        return Arrays.copyOf(resultado, pos);
    }

    private static int[] uniaoConjuntos(int[] conjuntoA, int[] conjuntoB) {
        int tamanhoA = conjuntoA.length;
        int tamanhoB = conjuntoB.length;
        int[] resultado = new int[tamanhoA + tamanhoB];
        int pos = 0;

        for (int i = 0; i < tamanhoA; i++) {
            resultado[pos++] = conjuntoA[i];
        }

        for (int i = 0; i < tamanhoB; i++) {
            if (Arrays.binarySearch(conjuntoA, conjuntoB[i]) < 0) {
                resultado[pos++] = conjuntoB[i];
            }
        }

        return Arrays.copyOf(resultado, pos);
    }
}

