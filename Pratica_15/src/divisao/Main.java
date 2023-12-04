package divisao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(System.in);

			System.out.println("Informe o primeiro numero: ");
			int num1 = input.nextInt();

			System.out.println("Informe o segundo número: ");

			int num2 = input.nextInt();
			
			double resp = divide(num1, num2);
			System.out.println(num1 + " / " + num2 + " = " + resp);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}

	}
	
	public static int divide(int a, int b) {
		return a/b;
	}

}
