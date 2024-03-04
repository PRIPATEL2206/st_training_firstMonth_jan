package decorator;//Decorator pattern example

class SugarDecorator extends CoffeeDecorator{

    public SugarDecorator(Coffee coffee){
        super(coffee);
    }

    public String decorate(){
        return super.decorate() + decorateWithSugar();
    }

    public String decorateWithSugar(){
        return " with Sugar";
    }

}
