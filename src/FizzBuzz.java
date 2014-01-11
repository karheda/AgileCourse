/**
 * Created with IntelliJ IDEA.
 * User: Carlos
 * Date: 11/01/14
 * Time: 11:07
 * To change this template use File | Settings | File Templates.
 */
public class FizzBuzz {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    public static String say(int number) {
        String value = String.valueOf(number);

        if (isThreeMultiple(number) && isFiveMultiple(number))
            value = FIZZ + BUZZ;

        else if (isThreeMultiple(number))
            value = FIZZ;

        else if (isFiveMultiple(number))
            value = BUZZ;

        return value;
    }

    private static Boolean isThreeMultiple(int number) {
        Boolean result = false;

        if(number%3 == 0)
            result = true;

        return result;
    }

    private static Boolean isFiveMultiple(int number) {
        Boolean result = false;

        if(number%5 == 0)
            result = true;

        return result;
    }

}
