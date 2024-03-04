package OopsConcepts.FactoryMethodT35;

public class p2 {
    public static void main(String[] args) {
        VehiclesFactory vf =new VehiclesFactory();
        vf.createCar("Swift");
        vf.createBike("Pulser");
    }
}
