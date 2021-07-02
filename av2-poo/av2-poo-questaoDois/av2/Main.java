import av2.PessoaFisica;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        PessoaFisica p1 = new PessoaFisica("Maria", "123.456.789-69", "23/08/1980");
        System.out.println(p1);
        System.out.println();
        
        PessoaFisica clone = p1.clone();
        System.out.println("Clone: " + clone);

    }
    
}


