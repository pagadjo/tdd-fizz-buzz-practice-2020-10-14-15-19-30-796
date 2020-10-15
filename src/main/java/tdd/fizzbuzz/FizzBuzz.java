package tdd.fizzbuzz;

public class FizzBuzz {
    private final String FIZZ = "Fizz";
    public String countOff(int orderNumber) {
        final boolean isModulo3 = (orderNumber % 3 == 0);
        if (isModulo3) {
            return FIZZ;
        }
        return String.valueOf(orderNumber);
    }
}
