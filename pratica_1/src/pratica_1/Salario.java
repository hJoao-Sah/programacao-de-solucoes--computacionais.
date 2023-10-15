package pratica_1;
import java.util.Scanner;
public class Salario {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe seu salario: ");
		double salario = input.nextDouble();
		
		double aumento = 0.25 * salario + salario;
		
		System.out.println("Informamos que seu salario teve um aumento de 25%!!!");
		System.out.print("Salario atual: "+ aumento);
		
	
	}

}
