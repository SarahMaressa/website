public class VeiculoBuilderImpl implements VeiculoBuilder{

    private Veiculo veiculo;

    public VeiculoBuilderImpl(){
        this.veiculo = new Veiculo();
    }

    @Override
    public void comPortas(int portas){
        veiculo.setPortas(portas);
    }

    @Override
    public void comJanelas(int janelas){
        veiculo.setJanelas(janelas);
    }

    @Override
    public void comRodas(int rodas) {
        veiculo.setRodas(rodas);   
    }

    @Override
    public void comMarca(String marca) {
        veiculo.setMarca(marca);    
    }

    @Override
    public void comModelo(String modelo) {
        veiculo.setModelo(modelo);
    }

    @Override
    public void comAno(int ano) {
        veiculo.setAno(ano);
    }

    @Override
    public void comKm(int km) {
        veiculo.setKm(km);;
    }

    @Override
    public void comPotenciaEmHP(int potenciaEmHP) {
        veiculo.setPotenciaEmHP(potenciaEmHP);
    }

    @Override
    public void comCor(String cor) {
        veiculo.setCor(cor);
    }

    @Override
    public Veiculo build() {
        return veiculo;
    }

    

}