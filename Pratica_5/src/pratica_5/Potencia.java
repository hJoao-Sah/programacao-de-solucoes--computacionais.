package pratica_5;
import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int resultado = 1;
		
		System.out.println("Informe o número base: ");
		int base = input.nextInt();
		
		System.out.println("Informe a potencia: ");
		int expoente = input.nextInt();
		
		if(expoente < 0) {
			System.out.println("Expoente invalido. ");
		}else {
			for(int i = 0; i < expoente; i++) {
				resultado *= base;
			}
		}
		
		System.out.println(base + " elevado a " + expoente + " é "+ resultado);
	} 

}
