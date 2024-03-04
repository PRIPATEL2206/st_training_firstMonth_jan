package OopsConcepts.StrategyPatternT16;

interface PaymentStrategy{
    void payment(int value);
}
class CreditCardPayment implements PaymentStrategy{

    @Override
    public void payment(int value) {
        System.out.println("Payment of "+value+ "is done using Cradit Card");
    }

}
class PayPalPayment implements PaymentStrategy{

    @Override
    public void payment(int value) {
        System.out.println("Payment of "+value+ "is done using PayPalPayment");
    }

}

public class p2 {
   public static void main(String[] args) {
    PaymentStrategy pay1=new CreditCardPayment();
    PaymentStrategy pay2=new PayPalPayment();
    pay1.payment(10);
    pay2.payment(20);
    
   }
    
}
