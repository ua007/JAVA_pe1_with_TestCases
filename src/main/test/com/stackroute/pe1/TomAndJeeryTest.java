package com.stackroute.pe1;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;
import org.junit.Test;

<<<<<<< HEAD:src/main/test/com/stackroute/pe1/TomAndJeeryTest.java
public class TomAndJeeryTest {
=======
public class tom_and_jeeryTest {
    
    tom_and_jeery tj;

    @Before
    public void setUp() throws Exception
    {
        tj=new tom_and_jeery();
    }

    @After
    public void tearDown() throws Exception {
        tj=null;
    }
    //success test cases
    
    //test case for jerry
>>>>>>> 0c8553146a8ad20238f2d8cce6dd1d6549058338:src/main/test/com/stackroute/pe1/tom_and_jeeryTest.java
    @Test
    public void givenIntegerIsBetween20And30AndIsEvenShouldReturnJerry(){
        TomAndJeery tj=new TomAndJeery();
        String result;
        result=tj.tom_and_jerry_check(24);
        assertEquals("Jerry",result);
    }
    //test case for tom
    @Test
    public void givenIntegerIsBetween20And30AndIsEvenShouldReturnTom(){
        TomAndJeery tj=new TomAndJeery();
        String result;
        result=tj.tom_and_jerry_check(25);
        assertEquals("Tom",result);
    }
    //failure test case
    @Test
    public void givenIntegerIsNotBetween20And30ShouldReturnTom(){
        TomAndJeery tj=new TomAndJeery();
        String result;
        result=tj.tom_and_jerry_check(15);
        assertEquals("Wrong input",result);
    }

}
