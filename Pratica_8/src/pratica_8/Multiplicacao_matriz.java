//package pratica_8;
//
//import java.util.Scanner;
//
//public class Multiplicacao_matriz {
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//
//		int linhas = 2;
//		int colunas = 2;
//
//		int[][] matriz_1 = new int[linhas][colunas];
//
//		int[][] matriz_2 = new int[linhas][colunas];
//
//		int[][] resultado = new int[linhas][colunas];
//
//		System.out.println("Informe os elementos da matriz A (2x2):");
//		for (int i = 0; i < linhas; i++) {
//			for (int j = 0; j < colunas; j++) {
//				System.out.print("Informe as posições da primeira matriz [" + i + "][" + j + "]: ");
//				matriz_1[i][j] = input.nextInt();
//			}
//		}
//
//		System.out.println("1 - matriz informada:");
//		for (int i = 0; i < linhas; i++) {
//			for (int j = 0; j < colunas; j++) {
//				System.out.print(matriz_1[i][j] + "\t");
//			}
//			System.out.println();
//		}
//
//		System.out.println("Informe os elementos da matriz B (2x2):");
//		for (int i = 0; i < linhas; i++) {
//			for (int j = 0; j < colunas; j++) {
//				System.out.print("Informe as posições da segunda matriz [" + i + "][" + j + "]: ");
//				matriz_2[i][j] = input.nextInt();
//			}
//		}
//
//		System.out.println("2 - matriz informada:");
//		for (int i = 0; i < linhas; i++) {
//			for (int j = 0; j < colunas; j++) {
//				System.out.print(matriz_2[i][j] + "\t");
//			}
//			System.out.println();
//		}
//
//		for (int i = 0; i < linhas; i++) {
//			for (int j = 0; j < colunas; j++) {
//				for (int k = 0; k < linhas; k++) {
//					resultado[i][j] += matriz_1[i][k] * matriz_2[k][j];
//				}
//			}
//		}
//
//		System.out.println("Matriz Resultante:");
//		for (int i = 0; i < linhas; i++) {
//			for (int j = 0; j < colunas; j++) {
//				System.out.print(resultado[i][j] + "\t");
//			}
//			System.out.println();
//		}
//	}
//}
