package pratica_7;

import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Informe o número de linhas da matriz: ");
		int linhas = input.nextInt();
		System.out.print("Informe o número de colunas da matriz: ");
		int colunas = input.nextInt();

		int[][] matriz = new int[linhas][colunas];

		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.print("Informe o elemento da posição [" + i + "][" + j + "]: ");
				matriz[i][j] = input.nextInt();
			}
		}

		System.out.println("Matriz informada:");
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("Matriz com indice par e com índice da coluna ímpar:");
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				if (i % 2 == 0 && j % 2 == 1) {
					System.out.print(matriz[i][j] + "\t");
				}
			}
			System.out.println();
		}
		
		System.out.println("Matriz invertida: ");
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.print(matriz[j][i] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("Diagonal para vertical: ");
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				if(matriz[0][j] == 0 && matriz[i][colunas - 1] == colunas - 1) {
					matriz[0][j] = matriz[i][colunas - 1 ];
					System.out.print(matriz[j][i] + "\t");
				}
				
			}
			System.out.println();
		}

	}
}
