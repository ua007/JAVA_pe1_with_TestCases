package com.stackroute.pe1;

import static org.junit.Assert.*;
import org.junit.Test;

public class PatternTest {
    @Test
    public void givenIntegerShouldReturnPattern(){
        Pattern num=new Pattern();
        String result;
        result=num.printing_pattern(5);
        assertEquals("122333444455555",result);
    }

}