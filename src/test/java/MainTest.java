import org.example.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MainTest {

    @Test
    void  isPositiv_returnTrue_numberIsPositive(){
        //Given
        int number = 1;
        boolean expected = true;
        //When
        boolean actual = Main.isPositive(number);
        //Then
        assertEquals(expected,actual);
    }

    @Test
    void isPositiv_returnFalse_numberIsNegative(){
        //Given
        int number = -1;
        boolean expected = false;
        //When
        boolean actual = Main.isPositive(number);
        //Then
        assertEquals(expected,actual);
    }

    @Test
    void multiply_returnTrue_withTwoNumbersRightAnswer(){
        //Given
        int a = 1;
        int b = 2;
        int expected = 2;
        //When
        int actual = Main.multiply(a,b);
        //Then
        assertEquals(expected,actual);
    }

    @Test
    void multiply_returnFalse_withTwoNumbersWrongAnswer(){
        //Given
        int a = 1;
        int b = 2;
        int expected = 3;
        //When
        int actual = Main.multiply(a,b);
        //Then
        assertNotEquals(expected,actual);
    }

}
