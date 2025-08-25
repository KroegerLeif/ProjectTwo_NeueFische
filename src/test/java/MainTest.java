import org.example.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
    void multiply_returnDiffrentAnswer_withTwoNumbersWrongAnswer(){
        //Given
        int a = 1;
        int b = 2;
        int expected = 3;
        //When
        int actual = Main.multiply(a,b);
        //Then
        assertNotEquals(expected,actual);
    }

    @Test
    void getFirstLeter_returnTrue_withText(){
        //Given
        String text = "Hello";
        String expected = "H";
        //When
        String actual = Main.getFirstLetter(text);
        //Then
        assertNotNull(actual);
        assertEquals(expected,actual);
    }

    @Test
    void getFirstLetter_null_WithEmptyString(){
        //Given
        String text = "";
        String expected = null;
        //When
        String actual = Main.getFirstLetter(text);
        //Then
        assertNull(actual);
        assertEquals(expected,actual);
    }

    @Test
    void devide_devision_withTwoNumbers(){
        //Given
        int a = 10;
        int b = 2;
        int expected = 5;
        //When
        int actual = Main.divide(a,b);
        //Then
        assertEquals(expected,actual);
    }

    @Test
    void divide_IllegalArgumentException_devisonByZero(){
        //Given
        int a = 1;
        int b = 0;
        //When
        assertThrows(IllegalArgumentException.class, () -> Main.divide(a,b));
    }

    @Test
    void isPrime_true_withPrimeNumber(){
        //Given
        int number = 3;
        int number1 = 7;
        int number2 = 11;
        boolean expected = true;
        //When
        boolean actual = Main.isPrime(number);
        boolean actual1 = Main.isPrime(number1);
        boolean actual2 = Main.isPrime(number2);
        //Then
        assertEquals(expected,actual);
        assertEquals(expected,actual1);
        assertEquals(expected,actual2);
    }

    @Test
    void isPrime_false_withPrimeNumber(){
        //Given
        int number = 9;
        int number1 = 10;
        int number2 = 14;
        boolean expected = false;
        //When
        boolean actual = Main.isPrime(number);
        boolean actual1 = Main.isPrime(number1);
        boolean actual2 = Main.isPrime(number2);
        //Then
        assertEquals(expected,actual);
        assertEquals(expected,actual1);
        assertEquals(expected,actual2);
    }

}
