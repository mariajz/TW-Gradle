import org.example.factorial.Factorial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {
    @Test
    void factorialZero(){
        Factorial factorialChecker = new Factorial(0);
        int resultFactorial = factorialChecker.check();
        assertEquals(1, resultFactorial);
    }
    @Test
    void factorialOne(){
        Factorial factorialChecker = new Factorial(1);
        int resultFactorial = factorialChecker.check();
        assertEquals(1,resultFactorial);
    }

    @Test
    void factorialFive(){
        Factorial factorialChecker = new Factorial(5);
        int resultFactorial = factorialChecker.check();
        assertEquals(120,resultFactorial);
    }

    @Test
    void factorialEight(){
        Factorial factorialChecker = new Factorial(8);
        int resultFactorial = factorialChecker.check();
        assertEquals(40320,resultFactorial);
    }

}
