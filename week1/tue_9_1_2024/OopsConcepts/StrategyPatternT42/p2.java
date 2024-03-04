package OopsConcepts.StrategyPatternT42;

class NormalBilling implements BillingSystem{

    @Override
    public void generateBill(int bill) {
        System.out.println("your bill is "+bill);
    }
}
class DiscountBilling implements BillingSystem{
    int dis;
    DiscountBilling(int d){
        dis=d;
    }
    @Override
    public void generateBill(int bill) {
        System.out.println("your bill is "+(bill-dis));
    }
}

public class p2 {
    public static void main(String[] args) {
        NormalBilling nb=new NormalBilling();
        DiscountBilling db=new DiscountBilling(10);
        nb.generateBill(300);
        db.generateBill(300);
    }
}
