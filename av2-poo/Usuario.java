import java.util.Calendar;

public class Usuario {
    private int idade;
    private int ano;
    private int mes;
    private String nome;

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public String toString() {
        return "Usuario [ano=" + ano + ", idade=" + idade + ", mes=" + mes + ", nome=" + nome + "]";
    }
}