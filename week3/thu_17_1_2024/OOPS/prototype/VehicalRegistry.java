package prototype;//Example for Prototype pattern

import java.util.HashMap;

class VehicalRegistry {

    private static HashMap<String,Vehical> vehicalMap = new HashMap<>();
    static{
        vehicalMap.put("TWO", new TwoWheelerVehical("120", "Royal Enfield", 100000, false));
        vehicalMap.put("FOUR", new FourWheelerVehical("125", "Harrier", 2500000, false, true));
    }

    public Vehical getVehical(String vehical) throws CloneNotSupportedException{
        return vehicalMap.get(vehical).clone();
    }
}