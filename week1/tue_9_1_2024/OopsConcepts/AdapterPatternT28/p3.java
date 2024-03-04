package OopsConcepts.AdapterPatternT28;

class ConcerteTargate implements Target{

    @Override
    public void request() {
        System.out.println("hadale Request in ConcerteTargate");
       
    }

}

class AdapteeA implements AdapteeInterface{
    Target t;
    AdapteeA(Target t){
        this.t=t;
    }

    @Override
    public void otherRequest() {
       t.request();
    }
}

public class p3 {
    public static void main(String[] args) {
        ConcerteTargate c=new ConcerteTargate();
    AdapteeA ad=new AdapteeA(c);
    c.request();
    ad.otherRequest();
    }
}
