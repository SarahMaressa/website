public abstract class Figura implements Prototype{

    protected int x;
    protected int y;
    
    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Figura(Figura source){
        super();
        this.x = source.x;
        this.y = source.y;
        
    }

    @Override
    public String toString() {
        return "Figura [x=" + x + ", y=" + y + "]";
    }
}