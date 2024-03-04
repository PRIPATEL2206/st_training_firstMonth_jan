package strategy;//Example for Strategy pattern

class PayPalPayment implements PaymentStrategy{
    @Override
    public String doPayment() {
        return "Doing payment using PayPal";
    }
}