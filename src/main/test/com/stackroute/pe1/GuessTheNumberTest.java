package com.stackroute.pe1;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuessTheNumberTest {
    
    @Before
    public void setUp() throws Exception
    {
        ob=new GuessTheNumber();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }
    @Test
    public void givenIntegerIsEqualToRandomNumberShouldReturnMessage(){
       
        String result;
        result=num.guessTheNumber(45,45);
        assertEquals("Number guessed matches the original number",result);
    }
    @Test
    public void givenIntegerIsGreaterThanRandomNumberShouldReturnMessage(){
        
        String result;
        result=num.guessTheNumber(55,45);
        assertEquals("Number guessed is more than original number",result);
    }
    @Test
    public void givenIntegerIsLessThanRandomNumberShouldReturnMessage(){
        
        String result;
        result=num.guessTheNumber(45,55);
        assertEquals("Number guessed is less than original number",result);
    }

}
