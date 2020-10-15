package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void should_return_1_when_order_number_is_1() {
        //given
        String actual = "";
        int orderNumber = 1;
        FizzBuzz fizzbuzz = new FizzBuzz();
        //when
        actual = fizzbuzz.countOff(orderNumber);
        //then
        assertEquals("1", actual);
    }

    @Test
    public void should_returnFizz_when_order_number_is_multiple_3() {
        //given
        String actual = "";
        int orderNumber = 15;
        FizzBuzz fizzbuzz = new FizzBuzz();
        //when
        actual = fizzbuzz.countOff(orderNumber);
        //then
        assertEquals("Fizz", actual);
    }
    @Test
    public void should_returnBuzz_when_order_number_is_multiple_5() {
        //given
        String actual = "";
        int orderNumber = 5;
        FizzBuzz fizzbuzz = new FizzBuzz();
        //when
        actual = fizzbuzz.countOff(orderNumber);
        //then
        assertEquals("Buzz", actual);
    }

}
