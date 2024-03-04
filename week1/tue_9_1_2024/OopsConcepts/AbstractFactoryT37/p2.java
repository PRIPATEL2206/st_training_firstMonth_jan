package OopsConcepts.AbstractFactoryT37;

class ConcreteFactories implements FurnitureFactory{

    @Override
    public Modern createModern() {
        return new Modern();
      }

    @Override
    public Victorian createVictorian() {
        return new Victorian();
    }

} 

public class p2 {
    public static void main(String[] args) {
        FurnitureFactory ff=new ConcreteFactories();
        ff.createModern();
        ff.createVictorian();
    }
}
