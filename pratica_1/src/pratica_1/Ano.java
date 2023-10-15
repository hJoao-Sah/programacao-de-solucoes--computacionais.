package pratica_1;
import java.time.LocalDate;
import java.util.Scanner;
public class Ano {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Em qual ano você nasceu? ");
		int anoNascimento = scanner.nextInt();
		
		LocalDate dataAtual = LocalDate.now();
		int AnoAtual = dataAtual.getYear();
		
		int idadeAtual = AnoAtual - anoNascimento;
		int idade2050 = 2050 - anoNascimento;
		
		System.out.println("Atualmente você tem " + idadeAtual + " anos.");
		System.out.print("Em 2050 você terá " + idade2050 + " anos.");
		
		
		
	}

}
