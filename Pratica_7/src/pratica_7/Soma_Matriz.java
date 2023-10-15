package pratica_7;

import java.util.Scanner;

public class Soma_Matriz {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int linhas = 2;

		int colunas = 2;

		int[][] matriz_1 = new int[linhas][colunas];
		int[][] matriz_2 = new int[linhas][colunas];
		int[][] matriz_soma = new int[linhas][colunas];

		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.print("Informe as posições da primeira matriz [" + i + "][" + j + "]: ");
				matriz_1[i][j] = input.nextInt();
			}
		}

		System.out.println("1 - matriz informada:");
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.print(matriz_1[i][j] + "\t");
			}
			System.out.println();
		}

		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.print("Informe as posições da segunda matriz [" + i + "][" + j + "]: ");
				matriz_2[i][j] = input.nextInt();
			}
		}

		System.out.println("2 - matriz informada:");
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.print(matriz_2[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("Soma das matrizes: ");
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				int soma = matriz_1[i][j] + matriz_2[i][j];
				matriz_soma[i][j] = soma;
				System.out.print(matriz_soma[i][j] + "\t");
			}
			System.out.println();
		}

	}
}
