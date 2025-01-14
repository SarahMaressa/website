public class Veiculo {

    private int portas;
    private int janelas;
    private int rodas;
    private String marca;
    private String modelo;
    private int ano;
    private int km;
    private int potenciaEmHP;
    private String cor;

    public Veiculo(int portas, int janelas, int rodas, String marca, String modelo, int ano, 
    int km, int potenciaEmHP, String cor){
    super();
    this.portas = portas;
    this.janelas = janelas;
    this.rodas = rodas;
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
    this.km = km;
    this.potenciaEmHP = potenciaEmHP;
    this.cor = cor;
    }

    public Veiculo(){

    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public int getJanelas() {
        return janelas;
    }

    public void setJanelas(int janelas) {
        this.janelas = janelas;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getPotenciaEmHP() {
        return potenciaEmHP;
    }

    public void setPotenciaEmHP(int potenciaEmHP) {
        this.potenciaEmHP = potenciaEmHP;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Veiculo [ano=" + ano + ", cor=" + cor + ", janelas=" + janelas + ", km=" + km + ", marca=" + marca
                + ", modelo=" + modelo + ", portas=" + portas + ", potenciaEmHP=" + potenciaEmHP + ", rodas=" + rodas
                + "]";
    }
    
    
}



    