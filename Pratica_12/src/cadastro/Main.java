package cadastro;

public class Main {
    public static void main(String[] args) {

        Cadastro cadastro = new Cadastro(6);

        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("joao vitor");
        pessoaFisica.setCPF("130.813.342-22");

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome("Empresa Teste");
        pessoaJuridica.setCNPJ("12.389.178/0001-10");

        cadastro.cadastrarPessoa(pessoaFisica);
        cadastro.cadastrarPessoa(pessoaJuridica);

        cadastro.imprimirCadastro();
    }
}
