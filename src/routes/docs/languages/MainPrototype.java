public class MainPrototype {
    public static void main(String[] args) {
    var prototipo = new Circulo(2,4,8);
    System.out.println(prototipo);
    
    var copia = prototipo.clonar();
    System.out.println(copia);
    }
}