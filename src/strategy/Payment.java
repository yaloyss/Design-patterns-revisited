package strategy;

import java.util.function.Function;

public class Payment {
    private Function<Double, String> paymentStrategy;

    public Payment(Function<Double, String> paymentStrategy)
    {
        this.paymentStrategy = paymentStrategy;
    }

    public String pay(double amount)
    {
        return paymentStrategy.apply(amount);
    }

    public void setPaymentStrategy(Function<Double, String> paymentStrategy)
    {
        this.paymentStrategy = paymentStrategy;
    }
}