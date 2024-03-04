package OopsConcepts.PrototypePatternT48;

abstract class AnimalProtoTypePatten implements Cloneable{
    String name;
    AnimalProtoTypePatten(String s){
        name=s;
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

public class p1 {
    
}
