package pratica_1;

import java.util.Scanner;

public class Peso {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Digite o peso atual (em kg): ");
        double pesoAtual = input.nextDouble();
    
        double pesoEngordar = pesoAtual + (pesoAtual * 0.15);

        double pesoEmagrecer = pesoAtual - (pesoAtual * 0.20);

        System.out.println("Se a pessoa engordar 15%, o novo peso será: " + pesoEngordar + " kg");
        System.out.println("Se a pessoa emagrecer 20%, o novo peso será: " + pesoEmagrecer + " kg");

        
    }
}
