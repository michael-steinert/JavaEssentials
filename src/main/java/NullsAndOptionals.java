import java.util.Optional;

public class NullsAndOptionals {
    public static void main(String[] args) {
        String nullString = null;
        handleNull(nullString);
        handleNullWithOptional(nullString);
    }

    private static void handleNull(String nullString) {
        try {
            System.out.println(nullString.toLowerCase());
        } catch (NullPointerException exception) {
            System.out.println("String is null");
        }
    }

    private static void handleNullWithOptional(String nullString) {
        Optional<String> optionalString = Optional.ofNullable(nullString);
        System.out.println(optionalString.orElse("String is null"));
    }
}
