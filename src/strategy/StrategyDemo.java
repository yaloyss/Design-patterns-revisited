package strategy;

import java.util.function.Function;

public class StrategyDemo {

    public static void main(String[] args) {
        Function<Double, String> payByCard = amount -> amount + " hrn payed by card.";
        Function<Double, String> payByPayPal = amount -> amount + " hrn payed via PayPal.";
        Function<Double, String> payByBank = amount -> amount + " hrn payed by bank transfer.";

        //зберігаєм стратегію
        Function<Double, String> paymentStrategy;

        paymentStrategy = payByCard;
        System.out.println(paymentStrategy.apply(399.98));

        paymentStrategy = payByPayPal;
        System.out.println(paymentStrategy.apply(989.99));

        paymentStrategy = payByBank;
        System.out.println(paymentStrategy.apply(654.3));
        }
    }