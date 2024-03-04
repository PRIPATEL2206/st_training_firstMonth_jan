package OopsConcepts.AbstractFactoryT13;

public class p1 {
    
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

