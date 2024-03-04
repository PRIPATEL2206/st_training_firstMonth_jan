package OopsConcepts.FactoryMethodT35;

interface Vehicls{
}

class Car implements Vehicls{
    String name;
    Car(String name){
        this.name=name;
        System.out.println(name+" car is Created");
    }
}
class Bike implements Vehicls{
    String name;
    Bike(String name){
        this.name=name;
        System.out.println(name+" Bike is Created");
    }
}

class VehiclesFactory{
    Car createCar(String name){
        return new Car(name);
    }
    Bike createBike(String name){
        return new Bike(name);
    }
}

public class p1 {
    
}
