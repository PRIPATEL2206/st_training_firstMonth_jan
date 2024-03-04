package OopsConcepts.BridgePatternT26;

class Red implements Color{

    @Override
    public void fill(String s) {
       System.out.println(s+" is filled with color red");
    }

}
class Blue implements Color{

    @Override
    public void fill(String s) {
       System.out.println(s+" is filled with color Blue");
    }
}

public class p2 {
    
}
