import CalculatorProject.Calculator;
import org.junit.Before;
import org.testng.annotations.Test;


import static org.junit.Assert.assertEquals;

public class calculatorTests extends Calculator {

    @Test
    public void addTwoNumbers(){
        assertEquals(20, add(10,10));
    }

    @Test
    public void addThreeNumbers(){
        assertEquals(20, add(5,5,10));
    }

    @Test
    public void subtractTwoNumbers(){
        assertEquals(0, subtract(10,10));
    }

    @Test
    public void subtractThreeNumbers(){
        assertEquals(0, subtract(20,10,10));
    }

    @Test
    public void multipleTwoNumbers(){
        assertEquals(100, multiple(10,10));
    }


}
