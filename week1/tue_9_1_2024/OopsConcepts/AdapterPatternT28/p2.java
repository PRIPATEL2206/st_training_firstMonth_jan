package OopsConcepts.AdapterPatternT28;

interface AdapteeInterface{
    void otherRequest();
}

class Adaptee implements AdapteeInterface{

    @Override
    public void otherRequest() {
       System.out.println("hadale otherRequest in Adaptee");
    }
}



public class p2 {
    
}
