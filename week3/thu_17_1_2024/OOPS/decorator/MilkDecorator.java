package decorator;//Decorator pattern example

class MilkDecorator extends CoffeeDecorator{

    public MilkDecorator(Coffee coffee){
        super(coffee);
    }

    public String decorate(){
        return super.decorate() + decorateWithMilk();
    }

    public String decorateWithMilk(){
        return " with Milk";
    }

}

