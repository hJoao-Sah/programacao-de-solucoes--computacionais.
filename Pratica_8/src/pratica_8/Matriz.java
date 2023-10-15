package pratica_8;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o número de linhas da matriz: ");
        int linhas = input.nextInt();
        System.out.print("Informe o número de colunas da matriz: ");
        int colunas = input.nextInt();

        int[][] matriz = criarMatriz(linhas, colunas);
        preencherMatriz(matriz);
        imprimirMatriz(matriz);
        imprimirMatrizIndicesPares(matriz);
        imprimirMatrizInvertida(matriz);
        imprimirDiagonalVertical(matriz);
    }

    public static int[][] criarMatriz(int linhas, int colunas) {
        return new int[linhas][colunas];
    }

    public static void preencherMatriz(int[][] matriz) {
        Scanner input = new Scanner(System.in);
        int linhas = matriz.length;
        int colunas = matriz.length;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Informe o elemento da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();
            }
        }
    }

    public static void imprimirMatriz(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz.length;

        System.out.println("Matriz informada:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void imprimirMatrizIndicesPares(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz.length;

        System.out.println("Matriz com índices pares:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (i % 2 == 0 && j % 2 == 1) {
                    System.out.print(matriz[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }

    public static void imprimirMatrizInvertida(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz.length;

        System.out.println("Matriz invertida:");
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < linhas; j++) {
                System.out.print(matriz[j][i] + "\t");
            }
            System.out.println();
        }
    }

    public static void imprimirDiagonalVertical(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz.length;

        System.out.println("Diagonal para vertical:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (i == j) {
                    matriz[0][j] = matriz[i][colunas - 1];
                    System.out.print(matriz[j][i] + "\t");
                }
            }
            System.out.println();
        }
    }
}

