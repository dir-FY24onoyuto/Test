package calc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ArgumentsSource; 

class CalculatorTest {
    
    @Test
    void testadd() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2,3));
    }
    
    @Test
    void testSubtract() {
       Calculator calculator = new Calculator();
       assertEquals(-1, calculator.subtract(2,3));
       
      
   }
}


