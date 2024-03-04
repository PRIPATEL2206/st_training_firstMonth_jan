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

// decoreters
abstract class CoffeeDecorater implements CoffeeInterface{
    CoffeeInterface co;
    CoffeeDecorater(CoffeeInterface co){
        this.co=co;
    }
    public int getPrize(){
        return co.getPrize();
    }
}

class MilkyCoffeee extends CoffeeDecorater{
    int milkPrize=2;
    MilkyCoffeee(Coffee co){
        super(co);
    }
    public int getPrize(){
        return co.getPrize()+milkPrize;
    }
}
class SugerCoffeee extends CoffeeDecorater{
    int milkPrize=3;
    SugerCoffeee(Coffee co){
        super(co);
    }
    public int getPrize(){
        return co.getPrize()+milkPrize;
    }
}


public class p2 {
    public static void main(String[] args) {
        CoffeeInterface co1=new Coffee();
        CoffeeInterface co2wm=new MilkyCoffeee(new Coffee());
        CoffeeInterface co2ws=new SugerCoffeee(new Coffee());

        System.out.println("simple coffee prize : "+co1.getPrize());
        System.out.println("coffee with milk prize : "+co2wm.getPrize());
        System.out.println("coffee with suger prize : "+co2ws.getPrize());
    }
}