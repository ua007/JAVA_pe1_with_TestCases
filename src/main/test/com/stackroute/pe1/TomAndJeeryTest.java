package com.stackroute.pe1;

import static org.junit.Assert.*;
import org.junit.Test;

public class TomAndJeeryTest {
    @Test
    public void givenIntegerIsBetween20And30AndIsEvenShouldReturnJerry(){
        TomAndJeery tj=new TomAndJeery();
        String result;
        result=tj.tom_and_jerry_check(24);
        assertEquals("Jerry",result);
    }
    @Test
    public void givenIntegerIsBetween20And30AndIsEvenShouldReturnTom(){
        TomAndJeery tj=new TomAndJeery();
        String result;
        result=tj.tom_and_jerry_check(25);
        assertEquals("Tom",result);
    }
    @Test
    public void givenIntegerIsNotBetween20And30ShouldReturnTom(){
        TomAndJeery tj=new TomAndJeery();
        String result;
        result=tj.tom_and_jerry_check(15);
        assertEquals("Wrong input",result);
    }

}