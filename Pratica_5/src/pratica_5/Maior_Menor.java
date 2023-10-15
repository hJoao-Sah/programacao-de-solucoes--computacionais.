package pratica_5;

import java.util.Scanner;

public class Maior_Menor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int menor = Integer.MAX_VALUE, numeros = 10, maior = Integer.MIN_VALUE, num = 0;
		
		for(int i = 1; i <= numeros; i++) {
			System.out.println(i + "º numero: ");
			num = input.nextInt();
			
			if(num > maior) {
				maior = num;
			}
			
			if(num < menor) {
				menor = num;
			}
			
			
		}
		
		System.out.println("Maior número: " + maior);
		System.out.println("Menor número: " + menor);
	}
}
