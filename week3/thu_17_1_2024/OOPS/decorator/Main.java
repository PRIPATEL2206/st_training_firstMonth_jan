package decorator;

public class Main {
    public static void main(String[] args) {

        //Normal coffeer
        Coffee coffee = new CoffeeDecorator(new CoffeeImpl());
        System.out.println(coffee.decorate());// >>> Coffee

        //Decorating coffee with milk
        Coffee coffee1 = new MilkDecorator(new CoffeeImpl());
        System.out.println(coffee1.decorate());// >>> Coffee with Milk

        //Decorating coffee with milk & Sugar
        Coffee coffee2 = new SugarDecorator(new MilkDecorator(new CoffeeImpl()));
        System.out.println(coffee2.decorate());// >>> Coffee with Milk with Sugar
    }
}

