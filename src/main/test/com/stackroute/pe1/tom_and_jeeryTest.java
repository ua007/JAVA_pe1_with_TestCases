package com.stackroute.pe1;

import static org.junit.Assert.*;
import org.junit.Test;

public class tom_and_jeeryTest {
    //success test cases
    
    //test case for jerry
    @Test
    public void givenIntegerIsBetween20And30AndIsEvenShouldReturnJerry(){
        tom_and_jeery tj=new tom_and_jeery();
        String result;
        result=tj.tom_and_jerry_check(24);
        assertEquals("Jerry",result);
    }
    //test case for tom
    @Test
    public void givenIntegerIsBetween20And30AndIsEvenShouldReturnTom(){
        tom_and_jeery tj=new tom_and_jeery();
        String result;
        result=tj.tom_and_jerry_check(25);
        assertEquals("Tom",result);
    }
    //failure test case
    @Test
    public void givenIntegerIsNotBetween20And30ShouldReturnTom(){
        tom_and_jeery tj=new tom_and_jeery();
        String result;
        result=tj.tom_and_jerry_check(15);
        assertEquals("Wrong input",result);
    }

}
