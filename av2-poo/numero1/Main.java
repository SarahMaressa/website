import java.util.Scanner;

public class Main {
    public static void main(String [] args) throws IdadeException, AnoException, MesException, NomeException {
        Scanner ler = new Scanner(System.in);

        Usuario u = new Usuario();
        Tratamento t = new Tratamento();
        int idade, mes, ano;
        String nome;
        
        System.out.println("Digite seu nome:");
        nome = ler.nextLine();
        u.setNome(nome);

        System.out.println("Digite sua idade:");
        idade = ler.nextInt();
        u.setIdade(idade);

        System.out.println("Digite seu mês de nascimento:");
        mes = ler.nextInt();
        u.setMes(mes);

        System.out.println("Digite seu ano de nascimento:");
        ano = ler.nextInt();
        u.setAno(ano);

        Tratamento.TratarUsuario(u);
       
    }
}