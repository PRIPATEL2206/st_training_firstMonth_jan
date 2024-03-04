package OopsConcepts.DecoratorPatternT15;

interface CoffeeInterface{
    int prize=12;
    int getPrize();
}
class Coffee implements CoffeeInterface{

    @Override
    public int getPrize() {
        return prize;
    }
}

public class p1 {
    public static void main(String[] args) {
        
    }
}