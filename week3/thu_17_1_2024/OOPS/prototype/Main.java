package prototype;//Example for Prototype pattern

public class Main {
    
    public static void main(String[] args) throws CloneNotSupportedException{
        VehicalRegistry vehicalRegistry = new VehicalRegistry();
        Vehical discover = vehicalRegistry.getVehical("TWO");
    }

}

