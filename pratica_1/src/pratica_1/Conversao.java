package pratica_1;
import java.util.Scanner;
public class Conversao {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double valor_dolar = 4.87;
		
		System.out.println("Informe um valor em dolar: ");
		double dolar = input.nextDouble();
		
		double real = dolar * valor_dolar;
		
		System.out.print(dolar + " dolares convertido em real é " + real + " reais" );
		

	}

}
