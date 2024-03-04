package strategy;//Example for Strategy pattern

class CreditCardPayment implements PaymentStrategy{
    @Override
    public String doPayment() {
        return "Doing payment using Credit Card";
    }
}

