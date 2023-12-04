package empresa;

public class Cadastro {
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa("João", 30, 1.75, 70.0);
        System.out.println("Informações da Pessoa:\n" + pessoa.Info());

       
        Empregado empregado = new Empregado("Maria", 25, 1.65, 60.0, 123, 3000.0, 0.1);
        System.out.println("\nInformações do Empregado:\n" + empregado.Info());
        System.out.println("Salário do Empregado: " + empregado.calcularSalario());

        
        Cliente cliente = new Cliente("Carlos", 40, 1.80, 80.0, 5000.0, 2000.0);
        System.out.println("\nInformações do Cliente:\n" + cliente.Info());
        System.out.println("Saldo do Cliente: " + cliente.obterSaldo());

        
        Administrador administrador = new Administrador("Ana", 35, 1.70, 65.0, 456, 4000.0, 0.12, 500.0);
        System.out.println("\nInformações do Administrador:\n" + administrador.Info());
        System.out.println("Salário do Administrador: " + administrador.calcularSalario());

        
        Operario operario = new Operario("Pedro", 28, 1.78, 75.0, 789, 2500.0, 0.08, 1000.0, 0.05);
        System.out.println("\nInformações do Operário:\n" + operario.Info());
        System.out.println("Salário do Operário: " + operario.calcularSalario());

       
        Vendedor vendedor = new Vendedor("Laura", 22, 1.60, 55.0, 234, 3500.0, 0.15, 20000.0, 0.03);
        System.out.println("\nInformações do Vendedor:\n" + vendedor.Info());
        System.out.println("Salário do Vendedor: " + vendedor.calcularSalario());
    }
}
