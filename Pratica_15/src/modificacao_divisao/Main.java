package modificacao_divisao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);

			System.out.println("Informe o primeiro numero: ");
			int num1 = input.nextInt();

			System.out.println("Informe o segundo número: ");

			int num2 = input.nextInt();
			
			double resp = divide(num1, num2);
			System.out.println(num1 + " / " + num2 + " = " + resp);
			

	}
	
	public static int divide(int a, int b) {
		if(a < 0 || b == 0) {
			throw new ArithmeticException("Error!Gentileza verificar se o divisor é igual a 0 ou se o dividendo é negativo. ");
		}else {
			return a/b;
		}
		
	}

}
