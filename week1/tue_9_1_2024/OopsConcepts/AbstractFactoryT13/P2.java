package OopsConcepts.AbstractFactoryT13;

public class P2 {
    
}

class ProductA{
    ProductA(){
        System.out.println("Product A is Constructed");
    }
}
class ProductB{
    ProductB(){
        System.out.println("Product B is Constructed");
    }
}

abstract class AbstractFactory{
 abstract ProductA  createProDuctA();
 abstract ProductB  createProDuctB();
}

class ConcreteFactory1 extends AbstractFactory{

    @Override
    ProductA createProDuctA() {
        return new ProductA();
    }

    @Override
    ProductB createProDuctB() {
        return new ProductB();
    }

}
class ConcreteFactory2 extends AbstractFactory{

    @Override
    ProductA createProDuctA() {
        return new ProductA();
    }

    @Override
    ProductB createProDuctB() {
        return new ProductB();
    }

}
