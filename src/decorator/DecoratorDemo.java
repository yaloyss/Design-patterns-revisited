package decorator;
import java.util.function.Function;

public class DecoratorDemo {
    public static void main(String[] args) {
        Function<String, String> diamond = s -> s + "Diamond\n";

        Function<String, String> addingGlow = s -> s + "Adding glow\n";
        Function<String, String> addingBorder = s -> s + "Adding border\n";

        Function<String, String> decoratedDiamond = diamond
                .andThen(addingBorder)
                .andThen(addingGlow);

        System.out.println("Drawing base shape:");
        System.out.print(diamond.apply(""));

        System.out.println("\nDrawing decorated shape with border and glow:");
        System.out.print(decoratedDiamond.apply(""));
    }
}
