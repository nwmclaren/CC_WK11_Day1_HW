import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        int addNumbers = calculator.add(15,13);
        assertEquals(28, addNumbers);
    }

    @Test
    public void canSubtract(){
        int subtractNumbers = calculator.subtract(13, 10);
        assertEquals(3,subtractNumbers);
    }

    @Test
    public void canMultiply(){
        int multiplyNumbers = calculator.multiply(9, 2);
        assertEquals(18, multiplyNumbers);
    }

    @Test
    public void canDivide(){
        int divideNumbers = calculator.divide(9, 3);
        assertEquals(3, divideNumbers);
    }

}
