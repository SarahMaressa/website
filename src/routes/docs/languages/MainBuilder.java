public class MainBuilder{
    public static void main(String[] args) {

        var builder = new VeiculoBuilderImpl();

        var fabricante = new Fabricante(builder);

        fabricante.comprar("Fiat");

        System.out.println(fabricante);

    }
}