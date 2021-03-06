package aula43.labs.exercicio02;

public class PessoaJuridica extends Contribuinte {
    //o imposto corresponde a 10% da renda bruta da pessoa

    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public double calcularImposto() {
        return this.getRendaBruta() * 0.1;
    }

    @Override
    public String toString() {
        String s = "Pessoa Jurídica[ ";
        s += super.toString();
        s += "; cnpj: " + cnpj;
        s += "; imposto a ser pago: " + calcularImposto() + "]";
        return s;
    }
}
