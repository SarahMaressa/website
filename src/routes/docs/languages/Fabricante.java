public class Fabricante {
    private VeiculoBuilder builder;

    public Fabricante(VeiculoBuilder builder) {
        super();
        this.builder = builder;
    }

    public Veiculo comprar(String marca){
        builder.comAno(2015);
        builder.comCor("Cinza");
        builder.comJanelas(4);
        builder.comKm(10000);
        builder.comMarca("Fiat");
        builder.comModelo("Toro");
        builder.comPortas(5);
        builder.comPotenciaEmHP(500);
        builder.comRodas(5);

        return builder.build();
    }
}