package pratica_5;
import java.util.Scanner;
public class Numero {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numero1 = 0, numero2 = 0;
		
		System.out.println("Informe o primeiro número: ");
		numero1 = input.nextInt();
		
		System.out.println("Informe o segundo número: ");
		numero2 = input.nextInt();
		
		for(int i = numero1; i <= numero2; i++) {
			
			System.out.println(i);
		}
	}

}
