package pratica_2;

import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número de diárias: ");
        int Diarias = scanner.nextInt();

        double Diaria = 500.00;
        double taxa = 0.00;

        if (Diarias < 15) {
            taxa = 15.00;
        } else if (Diarias == 15) {
            taxa = 10.00;
        } else {
            taxa = 5.00;
        }

        double total = (Diaria + taxa) * Diarias;

        System.out.println("Total a ser pago: R$" + total);

        
    }
}
