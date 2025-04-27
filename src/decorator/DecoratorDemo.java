package decorator;
import java.util.function.Function;

public class DecoratorDemo {
    public static void main(String[] args) {
        Function<String, String> diamond = (s) -> s + "Drawing Diamond\n";

        Function<String, String> addingGlow = (s) -> s + "Adding shadow\n";
        Function<String, String> addingBorder = (s) -> s + "Adding glow\n";

        Function<String, String> decoratedDiamond = diamond
                .andThen(addingBorder)
                .andThen(addingGlow);

        System.out.println("Base shape:");
        System.out.print(diamond.apply(""));

        System.out.println("\nDecorated shape with border and glow:");
        System.out.print(decoratedDiamond.apply(""));
    }
}
