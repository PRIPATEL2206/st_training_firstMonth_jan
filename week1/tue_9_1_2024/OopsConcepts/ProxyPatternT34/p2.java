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

class ProxyCostlyResource implements CostlyResource{

    boolean hasAccess;
    RealCostlyResource rcr;

    ProxyCostlyResource(RealCostlyResource rcr){
        this.rcr=rcr;
        hasAccess=true;
    }

    @Override
    public void access() {
        if(hasAccess){
            rcr.access();
            return;
        }
        System.out.println("not have access");
    }

    void changeAccess(boolean type){
        hasAccess=type;
    }

}

public class p2 {
    public static void main(String[] args) {
        RealCostlyResource rcr=new RealCostlyResource();
        ProxyCostlyResource pcr=new ProxyCostlyResource(rcr);
        pcr.access();
        pcr.changeAccess(false);
        pcr.access();
    }
}
