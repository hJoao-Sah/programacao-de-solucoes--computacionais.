package pratica_8;

import java.util.Scanner;

public class Soma_Matriz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int linhas = 2;
        int colunas = 2;

        int[][] matriz1 = new int[linhas][colunas];
        int[][] matriz2 = new int[linhas][colunas];
        int[][] matrizSoma = new int[linhas][colunas];

        preencherMatriz("primeira", matriz1, input);
        imprimirMatriz("1 - matriz informada:", matriz1);

        preencherMatriz("segunda", matriz2, input);
        imprimirMatriz("2 - matriz informada:", matriz2);

        somarMatrizes(matriz1, matriz2, matrizSoma);
        imprimirMatriz("Soma das matrizes:", matrizSoma);
    }

    public static void preencherMatriz(String nome, int[][] matriz, Scanner input) {
        System.out.println("Informe os elementos da " + nome + " matriz (2x2):");
        int linhas = matriz.length;
        int colunas = matriz.length;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Informe as posições da " + nome + " matriz [" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();
            }
        }
    }

    public static void imprimirMatriz(String titulo, int[][] matriz) {
        System.out.println(titulo);
        int linhas = matriz.length;
        int colunas = matriz.length;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void somarMatrizes(int[][] matriz1, int[][] matriz2, int[][] resultado) {
        int linhas = matriz1.length;
        int colunas = matriz1.length;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
    }
}
