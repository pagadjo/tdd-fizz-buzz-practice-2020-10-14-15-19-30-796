package tdd.fizzbuzz;

public class FizzBuzz {
    private final String FIZZ = "Fizz";
    private final String BUZZ = "Buzz";

    public String countOff(int orderNumber) {
        final boolean isModulo3 = (orderNumber % 3 == 0);
        final boolean isModulo5 = (orderNumber % 5 == 0);

        if (orderNumber % 7 == 0) {
            return String.valueOf(orderNumber);
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
