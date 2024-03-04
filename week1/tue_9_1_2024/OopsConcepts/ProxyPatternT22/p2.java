package OopsConcepts.ProxyPatternT22;
class RealImage implements Image{

    @Override
    public void display() {
       System.out.println("real image is displaying");
    }

}

class ProxyImage implements Image{
    boolean cndition;
    RealImage realImage;

    ProxyImage(RealImage ri){
        realImage=ri;
        cndition=true;
    }

    void setCondition(boolean b){
        cndition=b;
    }

    @Override
    public void display() {
        if (cndition){
            realImage.display();
        }
    }

}

public class p2 {
    public static void main(String[] args) {
        ProxyImage pi=new ProxyImage(new RealImage());
    pi.display();
    pi.setCondition(false);
    pi.display();
    }
}
