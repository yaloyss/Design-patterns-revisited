package strategy;

import java.util.function.Function;

public class StrategyDemo {

    public static void main(String[] args) {
        Function<Double, String> payByCard = amount -> amount + " hrn payed by card.";
        Function<Double, String> payByPayPal = amount -> amount + " hrn payed via PayPal.";
        Function<Double, String> payByBank = amount -> amount + " hrn payed by bank transfer.";

        Payment payment = new Payment(payByCard);
        System.out.println(payment.pay(399.98));

        payment.setPaymentStrategy(payByPayPal);
        System.out.println(payment.pay(989.99));

        payment.setPaymentStrategy(payByBank);
        System.out.println(payment.pay(654.3));
        }
    }