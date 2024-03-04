package strategy;//Example for Strategy pattern

public class Main {

    public static void main(String[] args) {
        
        //Performing Payments using different strategy

        PaymentStrategy payment1 = new CreditCardPayment();
        System.out.println(payment1.doPayment());// >>> Doing payment using Credit Card

        PaymentStrategy payment2 = new PayPalPayment();
        System.out.println(payment2.doPayment());// >>> Doing payment using PayPal

    }

}

