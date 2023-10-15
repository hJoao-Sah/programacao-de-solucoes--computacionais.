package pratica_5;
import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int idade = 0, pessoas = 10, soma = 0;
		
		for(int i = 1; i <= pessoas; i++) {
			System.out.println(i + "º pessoa informe a sua idade: ");
			idade = input.nextInt();
			
			soma += idade;
			
		}
		
		double media =  soma/pessoas;
		
		System.out.println("A media de idade: " + media);
	}

}
