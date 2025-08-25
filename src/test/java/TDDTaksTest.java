import org.example.TDDTask;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TDDTaksTest {
    @Test
    void sum_returnCorrectSum_twoNumbers(){
        //Given
        int number1 = 5;
        int number2 = 6;
        int expected = 11;
        //When
        int actual = TDDTask.sum(number1,number2);
        //Then
        assertEquals(expected,actual);
    }

    @Test
    void isEven_returnTrue_positivNumber(){
        //Given
        int number = 8;
        boolean expected = true;
        //When
        boolean actual = TDDTask.isEven(number);
        //Then
        assertEquals(expected,actual);
    }

    @Test
    void getFirstCharacter_firstCharacter_givenText(){
        //Given
        String text = "Hallo";
        char expected = 'H';
        //When
        char actual = TDDTask.getFirstCharacter(text);
        //Then
        assertEquals(expected,actual);
    }

    @Test
    void reverseString_returnReversedInput_TextGiven(){
        //Given
        String text = "Java";
        String expected = "avaJ";
        //When
        String actual = TDDTask.reverseString(text);
        //Then
        assertEquals(expected,actual);
    }

    @Test
    void isPalindrome_returnTrue_givenPalidrom(){
        //Given
        String text = "Otto";
        boolean expected = true;
        //When
        boolean actual = TDDTask.isPalindrome(text);
        //Then
        assertEquals(expected,actual);
    }

    @Test
    void isPalindrome_returnFalse_givenNoPalidrom(){
        //Given
        String text = "Java";
        boolean expected = false;
        //When
        boolean actual = TDDTask.isPalindrome(text);
        //Then
        assertEquals(expected,actual);
    }

    @Test
    void countVowels_returnVowelsAmount_TextWithVowels(){
        //Given
        String text = "Hallo";
        int expected = 2;
        //When
        int actual = TDDTask.countVowels(text);
        //Then
        assertEquals(expected,actual);
    }

    @Test
    void factorial_returnFraction_givenNumber(){
        //Given
        int number = 5;
        int expected = 120;
        //When
        int actual = TDDTask.factorial(number);
        //Then
        assertEquals(expected,actual);
    }

    @Test
    void factorial_returnOne_givenZero(){
        //Given
        int number = 0;
        int expected = 1;
        //When
        int actual = TDDTask.factorial(number);
        //Then
        assertEquals(expected,actual);
    }

    @Test
    void fibonacci_returnFibonaci_fabonaciValue(){
        //Given
        int number = 6;
        int expected = 8;
        //When
        int actual = TDDTask.fibonacci(number);
        //Then
        assertEquals(expected,actual);
    }

    @Test
    void mergeArrays_returnMergedArray_giveTwoArrays(){
        //Given
        int[] array1 = {1,2,3};
        int[] array2 = {4,5,6};
        int[] expected = {1,2,3,4,5,6};
        //When
        int[] actual = TDDTask.mergeArrays(array1,array2);
        //Then
        assertArrayEquals(expected,actual);
    }
}
