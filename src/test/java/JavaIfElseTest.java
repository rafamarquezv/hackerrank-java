import org.junit.Assert;
import org.junit.Test;

public class JavaIfElseTest {

    //If  n is odd, print Weird
    @Test
    public void shouldReturnWeirdIfNIsOdd() {
        final int givenOddInt = 1;
        final String expectedResult = JavaIfElse.WEIRD;
        String result = JavaIfElse.getStringFromInt(givenOddInt);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void shouldNotReturnWeirdIfNIsEven() {
        final int givenEvenInt = 2;
        final String unexpectedResult = JavaIfElse.WEIRD;
        String result = JavaIfElse.getStringFromInt(givenEvenInt);
        Assert.assertNotEquals(unexpectedResult, result);
    }

    // If n is even and in the inclusive range of 2 to 5, print Not Weird
    @Test
    public void shouldReturnNotWeirdIfNIsEvenAndTwoToFive() {
        final int givenOddInt = 4;
        final String expectedResult = JavaIfElse.NOT_WEIRD;
        String result = JavaIfElse.getStringFromInt(givenOddInt);
        Assert.assertEquals(expectedResult, result);
    }

    // If n is even and in the inclusive range of 6 to 20, print Weird
    @Test
    public void shouldReturnWeirdIfNIsEvenAndSixToTwenty() {
        final int givenOddInt = 6;
        final String expectedResult = JavaIfElse.WEIRD;
        String result = JavaIfElse.getStringFromInt(givenOddInt);
        Assert.assertEquals(expectedResult, result);
    }

    // If n is even and greater than 20, print Not Weird
    @Test
    public void shouldReturnNotWeirdIfNIsEvenAndGreaterThanTwenty() {
        final int givenOddInt = 22;
        final String expectedResult = JavaIfElse.NOT_WEIRD;
        String result = JavaIfElse.getStringFromInt(givenOddInt);
        Assert.assertEquals(expectedResult, result);
    }
}