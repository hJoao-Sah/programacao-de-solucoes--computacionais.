package ordenacao;

import java.util.Arrays;
import java.util.Scanner;

public class Ordenacao {

    
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    
    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    
    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

           
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            
            int pi = partition(array, low, high);

            
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    
    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;

               
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

       
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    
    public static void mergeSort(int[] array) {
        int n = array.length;
        if (n > 1) {
            int mid = n / 2;
            int[] left = Arrays.copyOfRange(array, 0, mid);
            int[] right = Arrays.copyOfRange(array, mid, n);

            mergeSort(left);
            mergeSort(right);

            merge(array, left, right);
        }
    }

    
    private static void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            array[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            array[k] = right[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Escolha o método de ordenação:");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Selection Sort");
            System.out.println("3. Insertion Sort");
            System.out.println("4. Quick Sort");
            System.out.println("5. Merge Sort");
            System.out.println("0. Sair");

            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Programa encerrado.");
                break;
            }

            int[] array = new int[10];

            System.out.println("Informe 10 números para serem ordenados:");
            for (int i = 0; i < 10; i++) {
                array[i] = scanner.nextInt();
            }

            switch (choice) {
                case 1:
                    bubbleSort(array);
                    break;
                case 2:
                    selectionSort(array);
                    break;
                case 3:
                    insertionSort(array);
                    break;
                case 4:
                    quickSort(array, 0, array.length - 1);
                    break;
                case 5:
                    mergeSort(array);
                    break;
                default:
                    System.out.println("Escolha inválida. Tente novamente.");
                    continue;
            }

            System.out.println("Array ordenado: " + Arrays.toString(array));

            System.out.println("Deseja ordenar outro array? (1 para sim, 0 para não)");
        } while (scanner.nextInt() == 1);

        scanner.close();
    }
}
