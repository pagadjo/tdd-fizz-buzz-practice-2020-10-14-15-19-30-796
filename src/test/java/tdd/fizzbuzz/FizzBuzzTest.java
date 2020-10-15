package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void should_return_1_when_order_number_is_1() {
        //given
        String actual = "";
        int orderNumber = 0;
        FizzBuzz fizzbuzz = new FizzBuzz();
        //when
        actual = fizzbuzz.countOff(orderNumber);
        //then
        assertEquals("1", actual);
    }

}
