package math.problems;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class UnitTestingMath {
    public static void main(String[] args) {
        int num = 5;

            Assert.assertEquals(120, Factorial.multiplyNumbers(num));
        }
    }




   /*rivate static Fibonacci fibonacci;

    @Before
    public void setUp() {
        fibonacci = new Fibonacci();
    }

    @Test
    public void calculate() {
      long expected=2;
      long actual;

        assertEquals(expected, fibonacci.calculate(2));
    }
}*/





