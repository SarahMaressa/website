public interface VeiculoBuilder {
    
    void comPortas(int portas);

    void comJanelas(int janelas);
    
    void comRodas(int rodas);
    
    void comMarca(String marca);
    
    void comModelo(String modelo);
    
    void comAno(int ano);
    
    void comKm(int km);
    
    void comPotenciaEmHP(int potenciaEmHP);
    
    void comCor(String cor);

    Veiculo build();
}