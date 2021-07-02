public class PessoaFisica implements Cloneable {

    private String nome;
    private String cpf;
    private String dataNasc;

    public PessoaFisica(String nome, String cpf, String dataNasc) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getDataNasc() {
        return dataNasc;
    }
    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
    @Override
    public String toString() {
        return "PessoaFisica [cpf=" + cpf + ", dataNasc=" + dataNasc + ", nome=" + nome + "]";
    }

    public PessoaFisica clone() throws CloneNotSupportedException{
        return (PessoaFisica) super.clone();
    }

}
