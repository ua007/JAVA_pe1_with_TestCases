package com.stackroute.pe1;

import static org.junit.Assert.*;
import org.junit.Test;

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
        
        String result;
        result=num.printing_pattern(5);
        assertEquals("122333444455555",result);
    }

}
