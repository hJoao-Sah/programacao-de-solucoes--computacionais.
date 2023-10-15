package loja;

import java.util.Scanner;

public class Produto {
	private int id;
	private String nome;
	private double preco;
	private static int ultimo_id = 0;

	public Produto() {
		id = ++ultimo_id;
		nome = "Nome não informado";
		preco = 0;
	}

	public Produto(String nome, double preco) {
		id = ++ultimo_id;
		setNome(nome);
		setPreco(preco);
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco < 0) {
			this.preco = 0;
		} else {
			this.preco = preco;
		}
	}

	public void reajustaPreco(double percentual) {
		double aumento = preco * (percentual / 100);
		preco += aumento;
	}

	public void exibe() {
		System.out.println("Produto: " + nome);
		System.out.println("Id: " + id);
		System.out.println("Nome: " + nome);
		System.out.println("Preço: R$" + preco);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe os detalhes do primeiro produto:");
		System.out.print("Nome: ");
		String nome1 = scanner.nextLine();
		System.out.print("Preço: R$");
		double preco1 = scanner.nextDouble();

		Produto produto1 = new Produto(nome1, preco1);

		System.out.println("Informe os detalhes do segundo produto:");
		System.out.print("Nome: ");
		scanner.nextLine(); 
		String nome2 = scanner.nextLine();
		System.out.print("Preço: R$");
		double preco2 = scanner.nextDouble();

		Produto produto2 = new Produto(nome2, preco2);

		System.out.println("Informe o percentual de reajuste: ");
		double percentual = scanner.nextDouble();

		produto1.reajustaPreco(percentual);
		produto2.reajustaPreco(percentual);

		System.out.println("Informações do primeiro produto:");
		produto1.exibe();

		System.out.println("\nInformações do segundo produto:");
		produto2.exibe();

		System.out.println("\nÚltimo ID gerado: " + Produto.ultimo_id);
	}
}
