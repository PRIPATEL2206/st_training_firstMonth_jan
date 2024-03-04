package decorator;//Decorator pattern example

class CoffeeImpl implements Coffee{
    @Override
    public String decorate() {
        return "Coffee";
    }
}

