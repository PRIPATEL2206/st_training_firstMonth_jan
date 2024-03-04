package decorator;//Decorator pattern example

class CoffeeDecorator implements Coffee{

    private Coffee coffee;

    public CoffeeDecorator(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public String decorate() {
        return coffee.decorate();
    }
}

