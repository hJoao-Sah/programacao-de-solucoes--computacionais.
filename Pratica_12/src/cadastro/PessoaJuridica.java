package cadastro;

class PessoaJuridica extends Pessoa {
    private String cnpj;

    public void setCNPJ(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCNPJ() {
        return cnpj;
    }

    public String toString() {
        return super.toString() + "\nCNPJ: " + cnpj;
    }
}