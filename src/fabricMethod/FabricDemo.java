package fabricMethod;
import java.util.function.Function;

public class FabricDemo {
    public static void main(String[] args) {
            Function<Void, Coffee> cappuccinoFactory = empty -> new Cappuccino();
            Function<Void, Coffee> espressoFactory = empty -> new Espresso();
            Function<Void, Coffee> latteFactory = empty -> new Latte();

            Coffee cappuccino = cappuccinoFactory.apply(null);
            Coffee espresso = espressoFactory.apply(null);
            Coffee latte = latteFactory.apply(null);

            System.out.println("\n" + cappuccino.prepare());
            System.out.println(espresso.prepare());
            System.out.println(latte.prepare());
        }
    }
