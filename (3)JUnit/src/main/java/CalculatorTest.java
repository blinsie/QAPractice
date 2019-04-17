import org.junit.Assert;
import org.junit.Test;


public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testDiv() {
        double result = calculator.Division(2,2);
        double expectedResult = 1;
        Assert.assertEquals(expectedResult, result, 0);
    }

    @Test
    public void testMulpl() {
        int result = calculator.Multiplication(24,6);
        int expectedResult = 144;
        Assert.assertEquals("Result: ", expectedResult, result);
    }

    @Test
    public void testPow() {
        int result = (int) Math.pow(24,6);
        int expectedResult = 191102976;
        Assert.assertEquals("Result: ", expectedResult, result);
    }

    @Test
    public void testSub() {
        int result = calculator.Substraction(9,-234);
        int expectedResult = 243;
        Assert.assertEquals("Result: ", expectedResult, result);
    }

    @Test
    public void testModDiv() {
        int result = calculator.Division(9,6);
        Assert.assertEquals("Result: ", 1, result);
    }
}
