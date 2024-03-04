package OopsConcepts.BridgePatternT40;

abstract class Shape{
 String type;
 Shape(String t){
    type=t;
 } 
}


class Engines{
    String name;
    Engines(String n){
        name=n;
    }

    void render(Shape s){
        System.out.println(s.type+" is rendered using "+name+" Engine");
    }
}

public class p1 {
    
}
