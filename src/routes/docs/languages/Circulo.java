public class Circulo extends Figura {
    
    private int raio;

    public Circulo(int x, int y, int raio){
        super(x, y);
        this.raio = raio;
    }

    public Circulo(Circulo source){
        super(source);
        this.raio = source.raio;
    }

    @Override
    public Prototype clonar() {
        return new Circulo(this);
    }

    @Override
    public String toString() {
        return "Circulo [raio=" + raio + ", figura = " + super.toString() + "]";
    }

    
    
}