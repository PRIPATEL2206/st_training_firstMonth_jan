package OopsConcepts.CompositionlT11;

public class P1 {
    
}

class Engine{
    String name;
    int hp;
    Engine(String name,int hp){
        this.name=name;
        this.hp=hp;
    }
}

class Car{
    Engine engine;
    String name;
    Car(String carName,String enginName,int hp){
        this.engine=new Engine(enginName,hp);
        this.name= carName;
    }
}