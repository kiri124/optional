import java.util.Optional;

public class b {
    public static void main(String[] args) {
        Optional<String> optionalValue = Optional.of("5");
        Optional<Integer> flatMappedOptional = optionalValue.flatMap(s -> parseToInteger(s));
        if (flatMappedOptional.isPresent()) {
            Integer value = flatMappedOptional.get();
            System.out.println("El valor flat-mapeado es: " + value); 
        } else {
            System.out.println("El Optional está vacío.");
        }
    }
    private static Optional<Integer> parseToInteger(String s) {
        try {
            int parsedValue = Integer.parseInt(s);
            return Optional.of(parsedValue);
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }
}
