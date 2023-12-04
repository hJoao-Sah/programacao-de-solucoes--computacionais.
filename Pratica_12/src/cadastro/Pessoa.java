package cadastro;

class Pessoa {
	private String nome;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public String toString() {
		return "Nome: " + nome;
	}
}
