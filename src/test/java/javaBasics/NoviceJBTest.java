package javaBasics;

import org.example.javaBasics.NoviceJB;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NoviceJBTest
{
    @Test
    void quadrat_squareValue_value(){
        //Given
        int number = 2;
        int expected = 4;
        //When
        int actual = NoviceJB.quadrat(number);
        //Then
        assertEquals(expected,actual);
    }

    @Test
    void quadrat_wrongNumber_value(){
        //Given
        int number = 2;
        int expected = 8;
        //When
        int actual = NoviceJB.quadrat(number);
        //Then
        assertNotEquals(expected,actual);
    }

    @Test
    void validateUserInput_returnTure_acceptedInput(){
        //Given
        String text = "Hallo";
        boolean excepted = true;
        //When
        boolean actual = NoviceJB.validateUserInput(text);
        //Then
        assertEquals(excepted,actual);
    }

    @Test
    void validateUserInput_returnFalse_acceptedInput(){
        //Given
        String text = "";
        String text1 = null;
        boolean excepted = false;
        //When
        boolean actual = NoviceJB.validateUserInput(text);
        boolean actual1 = NoviceJB.validateUserInput(text1);
        //Then
        assertEquals(excepted,actual);
        assertEquals(excepted,actual1);
    }
}
