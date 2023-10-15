package cadastro_veiculos;

import java.util.Scanner;

public class Cadastro {

	public static void main(String[] args) {
		int i;
		Veiculo[] veiculos = new Veiculo[3];
		Scanner teclado = new Scanner(System.in);

		for (i = 0; i < 3; i++) {
			veiculos[i] = new Veiculo();
			System.out.println("Informe a marca");
			veiculos[i].setMarca(teclado.next());
		}

		for (i = 0; i < 3; i++) {
			System.out.println("Marca: " + veiculos[i].getMarca());
		}

		for (i = 0; i < 3; i++) {

			veiculos[i] = new Veiculo();
			System.out.println("Informe o Modelo");
			veiculos[i].setModelo(teclado.next());
		}

		for (i = 0; i < 3; i++) {
			System.out.println("Modelo: " + veiculos[i].getModelo());
		}

		for (i = 0; i < 3; i++) {
			veiculos[i] = new Veiculo();
			System.out.println("Informe o Chassi: ");
			veiculos[i].setChassi(teclado.next());

		}

		for (i = 0; i < 3; i++) {
			System.out.println("Chassi: " + veiculos[i].getChassi());
		}

		for (i = 0; i < 3; i++) {
			veiculos[i] = new Veiculo();
			System.out.println("Informe a Placa: ");
			veiculos[i].setPlaca(teclado.next());

		}
		for (i = 0; i < 3; i++) {
			System.out.println("Chassi: " + veiculos[i].getPlaca());
		}

		for (i = 0; i < 3; i++) {
			veiculos[i] = new Veiculo();
			System.out.println("Informe a Cor: ");
			veiculos[i].setCor(teclado.next());

		}
		for (i = 0; i < 3; i++) {
			System.out.println("Cor: " + veiculos[i].getCor());
		}
	}

}