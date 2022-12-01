package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    void should_get_number_when_countOff_given_one() {
        //given
        int sequence =1 ;
        
        //when
        String result = new FizzBuzz().countOff(sequence);
        
        //then
        assertEquals("1", result);
    }

    @Test
    void should_get_fizz_when_countOff_given_multiple_of_3() {
        //given
        int sequence = 3;

        //when
        String result = new FizzBuzz().countOff(sequence);

        //then
        assertEquals("Fizz", result);
    }


}
