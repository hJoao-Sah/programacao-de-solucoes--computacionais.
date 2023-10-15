package pratica_1;
import java.util.Scanner;
public class Graus {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		 System.out.print("Quantos graus esta fazendo? ");
		 int graus = input.nextInt();
		 
		double conversao = (graus * 1.8) + 32;
		
        String resultado = String.format("%d graus em Fahrenheit é %.2f", graus, conversao);
		System.out.print(resultado);
		
	}

}
