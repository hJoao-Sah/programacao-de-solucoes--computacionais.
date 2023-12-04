package cadastro;

class Cadastro {
	private Pessoa[] pessoas;
	private int contador;

	public Cadastro(int tamanho) {
		pessoas = new Pessoa[tamanho];
		contador = 0;
	}

	public void cadastrarPessoa(Pessoa pessoa) {
		if (contador < pessoas.length) {
			pessoas[contador] = pessoa;
			contador++;
			System.out.println("Cadastro realizado com sucesso!");
		} else {
			System.out.println("Cadastro completo. Não é possível adicionar mais pessoas.");
		}
	}

	public void imprimirCadastro() {
		System.out.println("Cadastro:");
		for (int i = 0; i < contador; i++) {
			System.out.println(pessoas[i]);
			System.out.println("\n-------------------------");
		}
	}
}