package pratica_1;
import java.util.Scanner;
public class Area {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe a diagonal maior losango: ");
		double diagonalMaior = input.nextDouble();
		
		System.out.println("Informe a diagonal menor losango: ");
		double diagonalMenor = input.nextDouble();
		
		double area = (diagonalMaior * diagonalMenor)/2;
		
		System.out.print("A area do losango é " + area);
		
	}

}
