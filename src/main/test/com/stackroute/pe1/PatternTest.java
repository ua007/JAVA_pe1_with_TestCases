package com.stackroute.pe1;

import static org.junit.Assert.*;
import org.junit.Test;

<<<<<<< HEAD:src/main/test/com/stackroute/pe1/PatternTest.java
public class PatternTest {
    @Test
    public void givenIntegerShouldReturnPattern(){
        Pattern num=new Pattern();
=======
public class patternTest {
    pattern num;
    @Before
    public void setUp() throws Exception
    {
        num=new pattern();
    }

    @After
    public void tearDown() throws Exception {
        num=null;
    }
    //test case for integer 5
    @Test
    public void givenIntegerShouldReturnPattern(){
        
>>>>>>> 0c8553146a8ad20238f2d8cce6dd1d6549058338:src/main/test/com/stackroute/pe1/patternTest.java
        String result;
        result=num.printing_pattern(5);
        assertEquals("122333444455555",result);
    }

}
