package OopsConcepts.CompositionlT11;

public class P2 {
    public static void main(String[] args) {
        Car c1=new Car("oody","i34",36);
        System.out.println(c1.engine.name);
    }
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