import static org.junit.Assert.*;
import org.junit.*;


public class FizzBuzztest {

    @Test
    public void oneTriggersOne() {
        final String expected = "1";

        String result = FizzBuzz.say(1);

        assertEquals("Not One", expected, result);
    }

    @Test
    public void twoTriggersTwo() {
        final String expected = "2";

        String result = FizzBuzz.say(2);

        assertEquals("Not Two", expected, result);
    }

    @Test
    public void answersNumberAsString() {
        final String anyNumber = "11";

        String result = FizzBuzz.say(11);

        assertEquals("Not Two", anyNumber, result);
    }

    @Test
    public void threeTriggersFizz() {
        final String expected = "Fizz";

        String result = FizzBuzz.say(3);

        assertEquals("Not Fizz", expected, result);
    }

    @Test
    public void fiveTriggersBuzz() {
        final String expected = "Buzz";

        String result = FizzBuzz.say(5);

        assertEquals("Not Buzz", expected, result);
    }

    @Test
    public void sixTriggersFizz() {
        final String expected = "Fizz";

        String result = FizzBuzz.say(6);

        assertEquals("Not Fizz", expected, result);
    }

    @Test
    public void nineTriggersFizz() {
        final String expected = "Fizz";

        String result = FizzBuzz.say(9);

        assertEquals("Not Fizz", expected, result);
    }

    @Test
    public void tenTriggersBuzz() {
        final String expected = "Buzz";

        String result = FizzBuzz.say(10);

        assertEquals("Not Buzz", expected, result);
    }

    @Test
    public void fifteenTriggersFizzBuzz() {
        final String expected = "FizzBuzz";

        String result = FizzBuzz.say(15);

        assertEquals("Not FizzBuzz", expected, result);
    }
}