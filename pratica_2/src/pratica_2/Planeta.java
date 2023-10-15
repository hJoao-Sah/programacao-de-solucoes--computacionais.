package pratica_2;

import java.util.Scanner;

public class Planeta {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Informe a velocidade(Vo): ");
		double vel = input.nextDouble();

		System.out.print("Informe o tempo(t): ");
		double temp = input.nextDouble();

		System.out.println("Infome um planeta: ");
		System.out.println("1 - Mercúrio ");
		System.out.println("2 - Vênus ");
		System.out.println("3 - Terra ");
		System.out.println("4 - Marte ");
		System.out.println("5 - Jupiter ");
		System.out.println("6 - Satumo ");
		System.out.println("7 - Urano ");
		System.out.println("8 - Netuno ");
		System.out.println("9 - Plutão ");

		int escolha = input.nextInt();

		double gravidade = 0;

		switch (escolha) {
		case 1:
			gravidade = 3.7;

			break;
		case 2:
			gravidade = 8.8;
			break;
		case 3:
			gravidade = 9.8;
			break;
		case 4:
			gravidade = 3.8;
			break;
		case 5:
			gravidade = 26.4;
			break;
		case 6:
			gravidade = 11.5;
			break;
		case 7:
			gravidade = 9.3;
			break;
		case 8:
			gravidade = 12.2;
			break;
		case 9:
			gravidade = 0.6;
			break;
		default:

			System.out.println("Opção inválida.");
			break;
		}
		
		if (gravidade != 0) {
			double velocidade = vel - (gravidade * temp);
			double altura = vel * temp - (gravidade * (temp * temp) / 2);

			System.out.println("A velocidade da bola é v(t): " + velocidade);
			System.out.println("A altura da bola é h(t): " + altura);

		}
		
	}

}
