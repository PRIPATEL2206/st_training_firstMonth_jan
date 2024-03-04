package OopsConcepts.AbstractFactoryT37;

interface Furniture{
}

class Modern implements Furniture{
    Modern(){
        System.out.println("Modern is Created");
    }
}

class Victorian implements Furniture{
    Victorian(){
        System.out.println("Victorian is Created");
    }
}

interface FurnitureFactory{
    Modern createModern ();
    Victorian createVictorian();
}

public class p1 {
    
}
