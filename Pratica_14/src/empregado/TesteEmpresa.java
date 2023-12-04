package empregado;

public class TesteEmpresa {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        empresa.adicionaEmpregado(new Empregado("Empregado1", 30000, 2020));
        empresa.adicionaEmpregado(new Empregado("Empregado2", 25000, 2021));

        Gerente gerente = new Gerente("Gerente1", 50000, 2018);
        gerente.setNomeSecretaria("Secretaria1");
        empresa.adicionaEmpregado(gerente);

        Diretor diretor = new Diretor("Diretor1", 80000, 2015, "TI");
        empresa.adicionaEmpregado(diretor);
        empresa.reajustaSalarios(10);

        System.out.println(empresa.mostrEmpregados());
    }
}
