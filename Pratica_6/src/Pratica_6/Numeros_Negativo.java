package Pratica_6;

import java.util.Scanner;

public class Numeros_Negativo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numeros = new double[10];

        preencherNumeros(numeros, input);
        mostrarValoresVetor(numeros);
        mostrarPosicoesNegativos(numeros);
    }

    public static void preencherNumeros(double[] numeros, Scanner input) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Informe um número real: ");
            numeros[i] = input.nextDouble();
        }
    }

    public static void mostrarValoresVetor(double[] numeros) {
        System.out.println("Valores do vetor:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posição " + i + ": " + numeros[i]);
        }
    }

    public static void mostrarPosicoesNegativos(double[] numeros) {
        System.out.println("Posições com números negativos:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                System.out.println("Posição " + i + ": " + numeros[i]);
            }
        }
    }
}

