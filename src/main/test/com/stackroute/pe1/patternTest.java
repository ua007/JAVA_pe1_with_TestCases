package com.stackroute.pe1;

import static org.junit.Assert.*;
import org.junit.Test;

public class patternTest {
    @Test
    public void givenIntegerShouldReturnPattern(){
        pattern num=new pattern();
        String result;
        result=num.printing_pattern(5);
        assertEquals("122333444455555",result);
    }

}