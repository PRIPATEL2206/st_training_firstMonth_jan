package OopsConcepts.PrototypePatternT25;

abstract class Obj implements Cloneable{
    String name;
    Obj(String name){
        this.name=name;
    }
    protected Object clone(){
        try{
            Object t=super.clone();
            System.out.println("Object "+name+" is cloned");
            return t;
        }
        catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return null;

    }
} 

class Obj1 extends Obj{
    Obj1(String name){
        super(name);
    }
}
class Obj2 extends Obj{
    Obj2(String name){
        super(name);
    }
}
class Obj3 extends Obj{
    Obj3(String name){
        super(name);
    }
}

public class p1 {
    public static void main(String[] args) {
       
    }
}
