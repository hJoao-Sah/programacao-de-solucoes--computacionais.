package cadastro;

class PessoaFisica extends Pessoa {
    private String cpf;

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    public String getCPF() {
        return cpf;
    }

    
    public String toString() {
        return super.toString() + "\nCPF: " + cpf;
    }
}