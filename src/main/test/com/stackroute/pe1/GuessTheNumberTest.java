package com.stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class GuessTheNumberTest {
    @Test
    public void givenIntegerIsEqualToRandomNumberShouldReturnMessage(){
        GuessTheNumber num=new GuessTheNumber();
        String result;
        result=num.guessTheNumber(45,45);
        assertEquals("Number guessed matches the original number",result);
    }
    @Test
    public void givenIntegerIsGreaterThanRandomNumberShouldReturnMessage(){
        GuessTheNumber num=new GuessTheNumber();
        String result;
        result=num.guessTheNumber(55,45);
        assertEquals("Number guessed is more than original number",result);
    }
    @Test
    public void givenIntegerIsLessThanRandomNumberShouldReturnMessage(){
        GuessTheNumber num=new GuessTheNumber();
        String result;
        result=num.guessTheNumber(45,55);
        assertEquals("Number guessed is less than original number",result);
    }

}