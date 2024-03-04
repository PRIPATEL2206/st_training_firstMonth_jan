package OopsConcepts.ProxyPatternT34;

interface CostlyResource{
    void access();
}

class RealCostlyResource implements CostlyResource{

    @Override
    public void access() {
        System.out.println("Costly resurrse granted");
    }

}


public class p1 {
    
}
