package OopsConcepts.MediatorPatternT29;

class ConcreateMediatore implements Mediator{

    @Override
    public void sendMasage(Colleague c,String msg) {
        c.reciveMasage(msg);
         }
}

abstract class Colleague{
    ConcreateMediatore cm;
    Colleague(ConcreateMediatore cm)
    {
        this.cm=cm;
    }
    void sendMasage(Colleague c,String msg){
        cm.sendMasage(this, msg);
    }
 abstract void reciveMasage(String msg);
}

class ColleagueA extends Colleague{

    ColleagueA(ConcreateMediatore cm) {
        super(cm);
    }

    @Override
    void reciveMasage(String msg) {
        System.out.println("masage recive in ColleageA : "+msg);  
    }
}
class ColleagueB extends Colleague{

    ColleagueB(ConcreateMediatore cm) {
        super(cm);
    }

    @Override
    void reciveMasage(String msg) {
        System.out.println("masage recive in ColleageB : "+msg);  
    }
}


public class p2 {
    public static void main(String[] args) {
        ConcreateMediatore cm =new ConcreateMediatore();
        ColleagueA ca=new ColleagueA(cm);
        ColleagueB cb=new ColleagueB(cm);
        ca.sendMasage(cb, "masssgeA");
        cb.sendMasage(cb, "masssgeB");
    }
}
