package pratica_8;

import java.util.Scanner;

public class Soma_Pares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[5];
        int somaPares = 0;

        preencherNumeros(numeros, input, somaPares);
    }

    public static void preencherNumeros(int[] numeros, Scanner input, int somaPares) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Informe um número: ");
            numeros[i] = input.nextInt();

            if (numeros[i] % 2 == 0) {
                somaPares += numeros[i];
                mostrarDetalhesNumero(numeros[i], i, somaPares);
            }
        }
    }

    public static void mostrarDetalhesNumero(int numero, int posicao, int somaPares) {
        System.out.println("O número " + numero + " é par");
        System.out.println("Numero: " + numero + ", Posição: " + posicao + ", Soma dos pares: " + somaPares);
    }
}

