package tdd.fizzbuzz;

public class FizzBuzz {
    private final String FIZZ = "Fizz";
    private final String BUZZ = "Buzz";
    private final String WHIZZ = "Whizz";

    public String countOff(int orderNumber) {
        final boolean isModulo3 = (orderNumber % 3 == 0);
        final boolean isModulo5 = (orderNumber % 5 == 0);
        final boolean isModulo7 = (orderNumber % 7 == 0);

        if (isModulo3 && isModulo7) {
            return "FizzWhizz";
        }
        if (isModulo3 && isModulo5) {
            return FIZZ + BUZZ;
        }
        if (isModulo7) {
            return WHIZZ;
        }
        if (isModulo5) {
            return BUZZ;
        }
        if (isModulo3) {
            return FIZZ;
        }
        return String.valueOf(orderNumber);
    }
}
